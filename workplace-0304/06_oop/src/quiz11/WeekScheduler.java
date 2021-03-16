package quiz11;

import java.util.Scanner;

public class WeekScheduler {

	// field
	private int nthWeek;
	private Day[] week;
	private String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
	private Scanner sc = new Scanner(System.in);
	
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		week = new Day[7];
		for (int i = 0; i < week.length; i++) 
			week[i]  = new Day();
	}

	// method
	
	// 1. run()
	public void run() {
		while(true) {
			menu();
			System.out.print("작업 선택 >>>");
			int choice = sc.nextInt();
			sc.nextLine(); // choice 입력 뒤에 남아 있는 엔터를 제거하기 위한 코드
			switch (choice) {
			case 1: makeSchedule(); break;
			case 2: deleteSchedule(); break;
			case 3: updateSchedule(); break;
			case 4: searchSchedule(); break;
			case 5: printAllSchedule(); break;
			case 0: exit(); return; // run()메소드 종료
			default : System.out.println("없는 작업입니다. 다시 입력하세요.");
			}
		}
	}
	
	// 2. menu()
	private void menu() {
		System.out.println("=====스케쥴러=====");
		System.out.println("1. 스케쥴 만들기");
		System.out.println("2. 스케쥴 삭제하기");
		System.out.println("3. 스케쥴 수정하기");
		System.out.println("4. 스케쥴 조회하기");
		System.out.println("5. 전체 스케쥴 보기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("==================");
	}
	
	// 3. exit()
	private void exit() {
		System.out.println("스케쥴러를 종료합니다.");
		sc.close();
	}
	
	// 4. makeSchedule()
	private void makeSchedule() {
		System.out.println("==스케쥴 만들기==");
		System.out.print("스케쥴을 등록할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		sc.nextLine();
		weekName = weekName.substring(0,1);
		// 요일검색
		int path = -1;
		for (int i = 0; i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {
				path = i;
				break;
			}
		}
		// 잘못된 입력체크
		if(path == -1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		// 요일 검색 성공시
		if(week[path].getSchedule() == null || week[path].getSchedule().isEmpty()) { // 요일에 스케쥴이 없을 경우
			System.out.print(weekName + "요일의 신규 스케쥴 >>> ");
			String schedule = sc.nextLine();
			week[path].setSchedule(schedule);
			System.out.println(weekName + "요일에 신규 스케쥴이 저장되었습니다.");
		} else { // 요일에 스케쥴이 있을 경우
			System.out.println(weekName + "요일에 이미 스케쥴이 존재합니다");
		}
		
		System.out.println("=================");

	}
	
	// 5. deleteSchedule()
	private void deleteSchedule() {
		System.out.println("===스케쥴 삭제===");
		System.out.print("삭제할 스케쥴 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		sc.nextLine();
		weekName = weekName.substring(0,1);
		// 요일검색
		int path = -1;
		for (int i = 0; i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {
				path = i;
				break;
			}
		}
		// 잘못된 입력체크
		if(path == -1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		// 요일 검색 성공시
		if(week[path].getSchedule() == null || week[path].getSchedule().isEmpty()) { // 요일에 스케쥴이 없을 경우
			System.out.println("이미 이 요일에 스케쥴이 존재하지 않습니다");
		} else { // 요일에 스케쥴이 있을 경우
			while(true) {
				System.out.println(weekName + "요일 스케쥴: " + week[path].getSchedule());
				System.out.println("정말로 삭제하시겠습니까? Y/N");
				String ans = sc.next();
				ans = ans.substring(0,1);
				sc.nextLine();
				if(ans.equalsIgnoreCase("Y")) {
					week[path].setSchedule(null);
					System.out.println("정상적으로 스케쥴이 삭제되었습니다");
					break;
				}else if(ans.equalsIgnoreCase("N")){
					System.out.println("스케쥴 삭제를 취소하였습니다");
					break;
				}
				System.out.println("잘못된 입력입니다");
			}
		}
		System.out.println("=================");
	}
	
	// 6. updateSchedule()
	private void updateSchedule() {
		System.out.println("===스케쥴 수정===");
		System.out.print("수정할 스케쥴 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		sc.nextLine();
		weekName = weekName.substring(0, 1);
		// 요일검색
		int path = -1;
		for (int i = 0; i < week.length; i++) {
			if(weekNames[i].equals(weekName)) {
				path = i;
				break;
			}
		}
		// 잘못된 입력체크
		if(path == -1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		// 요일 검색 성공시
		if(week[path].getSchedule() == null || week[path].getSchedule().isEmpty()) { // 요일에 스케쥴이 없을 경우
			System.out.println("이미 이 요일에 스케쥴이 존재하지 않습니다");
			while(true) {
				System.out.println(weekName + "요일 스케쥴: " + week[path].getSchedule());
				System.out.println("새로운 스케쥴을 등록하시겠습니까? Y/N");
				String ans = sc.next();
				ans = ans.substring(0,1);
				sc.nextLine();
				if(ans.equalsIgnoreCase("Y")) {
					System.out.print("새로운 스케쥴을 입력해주세요 >> ");
					String schedule = sc.nextLine();
					week[path].setSchedule(schedule);
					System.out.println("정상적으로 스케쥴이 등록되었습니다");
					break;
				}else if(ans.equalsIgnoreCase("N")){
					System.out.println("스케쥴 등록을 취소하였습니다");
					break;
				}
				System.out.println("잘못된 입력입니다");
			}
		} else { // 요일에 스케쥴이 있을 경우
			while(true) {
				System.out.println(weekName + "요일 스케쥴: " + week[path].getSchedule());
				System.out.println("정말로 수정하시겠습니까? Y/N");
				String ans = sc.next();
				ans = ans.substring(0,1);
				sc.nextLine();
				if(ans.equalsIgnoreCase("Y")) {
					System.out.print("새로운 스케쥴을 입력해주세요 >> ");
					String schedule = sc.nextLine();
					week[path].setSchedule(schedule);
					System.out.println("정상적으로 스케쥴이 수정되었습니다");
					break;
				}else if(ans.equalsIgnoreCase("N")){
					System.out.println("스케쥴 수정를 취소하였습니다");
					break;
				}
				System.out.println("잘못된 입력입니다");
			}
		}
		System.out.println("=================");
	}
	
	// 7. searchSchedule()
	private void searchSchedule() {
		System.out.println("===스케쥴 검색===");
		System.out.print("검색할 스케쥴 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		sc.nextLine();
		weekName = weekName.substring(0, 1);
		// 요일검색
		int path = -1;
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				path = i;
				break;
			}
		}
		// 잘못된 입력체크
		if (path == -1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.print(weekName + "요일: ");
		week[path].info();
		System.out.println("=================");
	}

	// 8. printAllSchedule()
	private void printAllSchedule() {
		System.out.println("===전체 스케쥴===");
		for (int i = 0; i < week.length; i++) {
			System.out.print(weekNames[i] + "요일: ");
			week[i].info();
		}
		System.out.println("=================");
	}
}
