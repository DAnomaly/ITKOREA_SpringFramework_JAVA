package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz02 {

	public static void main(String[] args) {
		
		// 임의의 3명의 staff을 삽입하세요.
		// 반복문과 배열을 사용하세요.
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "INSERT INTO staff VALUES(?,?,?,?)";
		int[] nos = {3,4,5};
		String[] names = {"Laffey","Z46","Nicholas"};
		String[] departments = {"destroyer","destroyer","destroyer"};
		String[] hireDates = {"21-01-05","21-01-04","21-01-04"};
		
		int result = 0;
			try {
				conn = DBConnection.getConnection();
				for (int i = 0; i < nos.length; i++) {
					ps = conn.prepareStatement(sql);
					ps.setInt(1, nos[i]);
					ps.setString(2, names[i]);
					ps.setString(3, departments[i]);
					ps.setString(4, hireDates[i]);
					result += ps.executeUpdate();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println(result + "행을 성공적으로 추가하였습니다");
				try {
					if(ps != null)
						ps.close();
					if(conn != null)
						conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
				
	} // main
	
}
