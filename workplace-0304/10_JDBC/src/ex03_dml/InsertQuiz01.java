package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertQuiz01 {

	public static void main(String[] args) {
		
		// 임의의 3명의 staff을 삽입하세요.
		// 반복문과 배열을 사용하세요.
		Connection conn = null;
		PreparedStatement ps = null;
		String[] sqls = new String[3];
		sqls[0] = "INSERT INTO staff VALUES(3,'james','인사','21/03/24')";
		sqls[1] = "INSERT INTO staff VALUES(4,'status','개발','21/03/24')";
		sqls[2] = "INSERT INTO staff VALUES(5,'phone','개발','21/03/24')";
		
		String[] dels = new String[3];
		for (int i = 3; i < 3 + (dels.length); i++) {
			dels[i-3] = "DELETE FROM staff WHERE no = " + i;
		}
		
			try {
				conn = DBConnection.getConnection();
				for (int i = 0; i < sqls.length; i++) {
					ps = conn.prepareStatement(sqls[i]);
					int result = ps.executeUpdate();
					if(result == 0)
						System.out.println("행을 추가하지 못하였습니다");
					else
						System.out.println("행을 성공적으로 추가하였습니다");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(ps != null)
						ps.close();
					if(conn != null)
						conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
				
	}
	
}
