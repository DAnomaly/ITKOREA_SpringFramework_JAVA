package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class CreateTableMainClass {

	public static void main(String[] args) {
		
		try {
			// 1. Connection
			Connection conn = DBConnection.getConnection();
			
			// 2. 쿼리문을 미리 준비합니다. (PreparedStatement 클래스를 사용하므로)
			// 키워드는 대문자, 테이블/칼럼은 소문자
			String sql = "CREATE TABLE staff("
					+ "no NUMBER PRIMARY KEY,"
					+ "name VARCHAR2(100),"
					+ "department VARCHAR2(100),"
					+ "hireDate DATE DEFAULT SYSDATE"
					+ ")";
			
			// 3. 쿼리문 처리를 위한 PreparedStatement ps 객체 생성
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 4. 쿼리문 실행
			ps.executeUpdate();

			System.out.println("staff 테이블이 생성되었습니다");
			
			// 5. 자원(리소스) 반납 
			ps.close();
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
