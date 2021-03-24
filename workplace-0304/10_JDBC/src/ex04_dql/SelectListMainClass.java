package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connection.DBConnection;

public class SelectListMainClass {

	public static void main(String[] args) {
		
		// 필드
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Map<String,Object>> list = new ArrayList<>();
		
		// 검색
		String sql = "SELECT * FROM staff";
		
		// 입력
		try {
			conn = DBConnection.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			// 결과 행 1개 : Map
			// 결과 행 전체 : List
			while(rs.next()) {
				Map<String,Object> map = new HashMap<>();
				map.put("no", rs.getInt(1));
				map.put("name", rs.getString(2));
				map.put("department", rs.getString(3));
				map.put("hireDate", rs.getDate(4));
				list.add(map);
			}
			
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
		
		// 출력
		System.out.println("검색된 staff의 개수:" + list.size());
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
		
	}
	
}
