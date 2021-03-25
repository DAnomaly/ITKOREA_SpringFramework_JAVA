package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.AddressDto;

public class AddressDao {

	// field
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;

	// Singleton
	private static AddressDao addressDao = new AddressDao();

	private AddressDao() {
	}

	public static AddressDao getInstance() {
		return addressDao;
	}

	// getConnection()
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SPRING";
		String password = "1111";

		return DriverManager.getConnection(url, user, password);
	}

	// close()
	private void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// insert()
	public int insert(AddressDto dto) {
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO address (no, name, phone) VALUES(?, ?, ?)";
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNo());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getPhone());
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(conn, ps, null);
		}
		
		return result;
	}

	// selectList()
	public List<AddressDto> selectList() {
		List<AddressDto> list = new ArrayList<AddressDto>();

		try {
			conn = getConnection();

			String sql = "SELECT no, name, phone FROM address";

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				AddressDto dto = new AddressDto();
				dto.setNo(rs.getInt(1));
				dto.setName(rs.getString(2));
				dto.setPhone(rs.getString(3));
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
