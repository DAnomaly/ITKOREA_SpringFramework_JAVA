package main;

import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no;
	
	// method
	private void menu() {
		System.out.println("=====사원관리프로그램=====");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 조회");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("==========================");
	}
	public void execute() {
		while(true) {
			menu();
			System.out.print("선택(1~6) >>> ");
			switch (sc.nextInt()) {
			case 1: insertStaff(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: return;
			default : System.out.println("다시 선택하세요."); break;
			}
		}
	}
	
	private void insertStaff(){
		no++;
		StaffDto dto = new StaffDto();
		System.out.print("사원명 >> ");
		String name = sc.next();
		System.out.print("부서명 >> ");
		String department = sc.next();
		dto.setNo(no);
		dto.setName(name);
		dto.setDepartment(department);
		int result = dao.insertStaff(dto); // DB에 삽입
		System.out.println(result + "명의 사원이 추가되었습니다");
	}
	
}
