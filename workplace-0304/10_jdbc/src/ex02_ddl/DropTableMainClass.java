package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			System.out.println("staff 테이블이 삭제되었습니다");
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
