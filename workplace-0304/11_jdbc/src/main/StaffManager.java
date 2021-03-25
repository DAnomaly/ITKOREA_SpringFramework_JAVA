package main;

import java.util.List;
import java.util.Scanner;

import dao.StaffDao;
import dto.StaffDto;

public class StaffManager {

	// field
	private StaffDao dao = StaffDao.getInstance();
	private Scanner sc = new Scanner(System.in);
	private int no = dao.getMaxNo();

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
		while (true) {
			menu();
			System.out.print("선택(1~6) >>> ");
			switch (sc.nextInt()) {
			case 1:
				insertStaff();
				break;
			case 2:
				updateStaff();
				break;
			case 3:
				deleteStaff();
				break;
			case 4:
				selectOneStaff();
				break;
			case 5:
				selectListStaff();
				break;
			case 6:
				return;
			default:
				System.out.println("다시 선택하세요.");
				break;
			}
		}
	}

	private void insertStaff() {
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

	private void updateStaff() {
		StaffDto dto = new StaffDto();
		System.out.print("수정할 사원 번호 입력 >>> ");
		int no = sc.nextInt();
		dto = dao.selectOne(no);
		if (dto == null)
			System.out.println("검색된 사원을 찾지 못하였습니다");
		System.out.print("수정할 내용을 선택하세요 (1:이름 2:부서) >>>");
		switch (sc.nextInt()) {
		case 1:
			System.out.print("사원 이름 입력 >>> ");
			String name = sc.next();
			dto.setName(name);
			break;
		case 2:
			System.out.print(" 부서 이름 입력 >> ");
			String department = sc.next();
			dto.setDepartment(department);
			break;
		default:
			System.out.println("수정이 취소되었습니다");
		}
		int result = dao.updateStaff(dto);
		if(result == 0)
			System.out.println("회원 수정 중 오류가 발생하였습니다");
		else
			System.out.println("사원정보를 정상적으로 수정하였습니다");
	}

	private void deleteStaff() {
		StaffDto dto = new StaffDto();
		System.out.print("삭제할 사원 번호 입력 >>> ");
		int no = sc.nextInt();
		dto.setNo(no);

		int result = dao.deleteStaff(dto);
		if (result == 0)
			System.out.println("검색된 사원을 찾지 못하였습니다");
		else
			System.out.println(no + "번 사원을 정상적으로 삭제하였습니다");
	}

	private void selectOneStaff() {
		System.out.print("검색할 사원 번호 입력 >>> ");
		int no = sc.nextInt();

		StaffDto dto = dao.selectOne(no);
		if (dto == null)
			System.out.println("검색된 사원을 찾지 못하였습니다");
		else
			System.out.println(dto);
	}

	private void selectListStaff() {
		List<StaffDto> list = dao.selectList();
		int size = list.size();
		if (size == 0)
			System.out.println("저장된 사원이 없습니다");
		else {
			System.out.println("총 사원 수 : " + size + "명");
			for (StaffDto dto : list) {
				System.out.println(dto);
			}
		}
	}
}
