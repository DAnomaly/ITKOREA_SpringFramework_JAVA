package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT no,name,department,hireDate FROM staff WHERE no = 1";
		
		Map<String, Object> map = new HashMap<>();
		
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // SELECT문의 실행은 executeQuery() 메소드입니다
			// rs에 저장된 데이터는 '반드시' next() 메소드를 호출해서 꺼냅니다
			// next() 메소드
			// 1. 결과 행에서 순서대로 한 행씩 꺼냅니다
			// 2. 꺼낼 결과 행이 존재하면 true를 반환하고, 없으면 false를 반환합니다
			if(rs.next()) {
				map.put("no", rs.getInt("no")); 					// rs.getInt(1);
				map.put("name", rs.getString("name"));				// rs.getString(2);
				map.put("department", rs.getString("department"));	// rs.getString(3);
				map.put("hiredate", rs.getDate("hiredate"));		// rs.getDate(4);
				
				System.out.println(map.get("no") + ", " + map.get("name") + ", " + map.get("department") + ", " + map.get("hiredate"));
			} else
				System.out.println("해당 staff가 없습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)
					rs.close();
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
