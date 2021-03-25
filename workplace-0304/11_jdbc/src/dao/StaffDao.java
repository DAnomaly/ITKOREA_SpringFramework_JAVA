package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;


// DAO : Database Access Object
// DB의 CRUD를 처리하는 메스드를 포함하고 있습니다

public class StaffDao {

	// field
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	// constructor (singleton pattern)
	// 1. 하나의 StaffDao만 생성할 수 있습니다
	// 2. 원리
	// 	  1) 외부에서는 new StaffDao()가 불가능하도록 설계합니다.
	// 	  2) 내부에서 new StaffDao()를 실행하고 생성된 1개의 인스턴스를 반환하는 메소드를 만듭니다
	// 3. getInstacne() 메소드 호출 방법
	//    1) 객체(인스턴스) : private StaffDao() {} 때문에 외부에서는 객체 생성이 불가능합니다.
	//    2) 클래스 : 클래스 메소드로 바꿔야 합니다. static 처리를 해야 합니다.
	private StaffDao() {}
	private static StaffDao staffDao = new StaffDao();
	public static StaffDao getInstance() {
		return staffDao;
	}

	// method
	
	/****** 1. 접속 ******/
	private Connection getConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";

		return DriverManager.getConnection(url, user, password);
		
	}
	
	/****** 2. 접속 해제 ******/
	private void close(Connection conn, PreparedStatement ps , ResultSet rs) {
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
	
	/****** 3. staff 추가하기 ******/
	//public int insertStaff(int no, String name, String department) {
	public int insertStaff(StaffDto dto) {
		
		try {
			conn = getConnection(); // 접속은 메소드마다 열고 닫는 것이 제일 좋습니다
			sql = "INSERT INTO staff (no, name, department, hireDate) values(?,?,?,SYSDATE)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1,dto.getNo());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getDepartment());
			result = ps.executeUpdate(); // executeUpdate() : INSERT, UPDATE, DELETE
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, ps, null);
		}
		
		return result; // result는 삽입되면 1, 실패하면 0
	}
	
	/****** 4. staff  ******/
	public List<StaffDto> getList() {
		List<StaffDto> list = new ArrayList<StaffDto>();
		
		try {
			conn = getConnection();
			sql = "SELECT no, name, department, hiredate FROM staff";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				StaffDto dto = new StaffDto();
				dto.setNo(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setDepartment(rs.getString(3));
				dto.setHireDate(rs.getDate(4));
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, ps, rs);
		}
		
		return list;
	}
	
}
