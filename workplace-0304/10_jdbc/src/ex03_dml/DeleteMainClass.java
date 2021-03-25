package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class DeleteMainClass {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM staff WHERE department = '자재'";

		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			if (result == 0)
				System.out.println("삭제된 정보가 없습니다");
			else
				System.out.println(result + "명의 정보가 삭제되었습니다");

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
