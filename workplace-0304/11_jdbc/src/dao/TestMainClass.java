package dao;

import java.util.List;

import dto.StaffDto;

public class TestMainClass {

	public static void main(String[] args) {

		StaffDao dao = StaffDao.getInstance();

		List<StaffDto> list = dao.getList();
		
		System.out.println(list);
	}

}
