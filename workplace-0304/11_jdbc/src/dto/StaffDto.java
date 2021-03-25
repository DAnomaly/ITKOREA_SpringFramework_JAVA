package dto;

import java.sql.Date;

// DB Table에 저장된 행(Row)을 저장하는 클래스
// VO : Value Object
// DTO : Data Transfer Object

// 테이블 칼럼		클래스 필드
// BOARD_NO			board_no 또는 boardNo	 
// BNO				bNo

// 디폴트 생성자 필수 : 생성자를 안 만들거나, 디폴트 생성자와 필드를 이용한 생성자를 모두 만듭니다
// getter/setter 필수

public class StaffDto {
	
	// field
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	
	// getter/setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "[no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
}
