package connection;

import java.sql.Connection;

public class TestMainClass {

	public static void main(String[] args) {
		
		// DBConnection 클래스의 getConnection() 메소드를 호출합니다
		// getConnection() throws Exception 이므로 try - catch 처리합니다.
		
		try {
			/* ====== 인스턴스 메소드 getConnection() ======
			   DBConnection connection = new DBConnection;
			   Connection conn = connection.getConncetion();
			*/
			// ====== 클래스 메소드 getConnection() ======
			Connection conn = DBConnection.getConnection();
			System.out.println("DB에 접속되었습니다");
			
			conn.close();
			System.out.println("DB접속이 해제되었습니다");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
}
