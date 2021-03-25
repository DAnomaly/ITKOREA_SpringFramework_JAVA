package ex03_dml;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.*; // java.sql 패키지의 모든 클래스를 import합니다.

import connection.DBConnection;


public class InsertMainClass {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no,name,department,hiredate) values (1,'alice','총무','21/03/22')"; // sql문
			ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			// executeUpdate() 메소드 반환 값
			// → 변화가 생긴 행(Row)의 개수가 반환됩니다
			// 실패하면 0이 반환되고, 성공하면 INSERT된 행(Row)의 개수가 반환됩니다.
			if( result == 0 ) 
				System.out.println("행이 추가되지 않았습니다");
			else
				System.out.println("정상적으로 행이 추가되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
}
