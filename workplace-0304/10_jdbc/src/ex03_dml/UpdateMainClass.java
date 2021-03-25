package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "UPDATE staff SET department = ? WHERE no = ?";
		
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, "설계");
			ps.setInt(2, 5);
			int result = ps.executeUpdate();
			if(result == 0)
				System.out.println("UPDATE에 실패하였습니다");
			else
				System.out.println("UPDATE에 성공하였습니다");
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
