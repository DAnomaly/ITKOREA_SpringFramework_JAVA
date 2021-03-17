package quiz12;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertHall {

	// field
	private final char[] SEAT_TYPES = { 'S', 'R', 'A', 'B' };
	private final int[] CHARGES = { 200000, 150000, 100000, 50000 };
	private final int[] SEAT_COUNTS = { 2, 5, 10, 20 };
	private String hallName;
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);

	// constructor
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[SEAT_TYPES.length];
		for (int i = 0; i < seatGroups.length; i++) {
			seatGroups[i] = new SeatGroup(SEAT_TYPES[i],CHARGES[i],SEAT_COUNTS[i]);
		}
	}
	
	// method
	public void run() {
		while(true) {
			menu();
			System.out.print("입력 >> ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: reservation(); break;
			case 2: cancel(); break;
			case 3: inquiry(); break;
			case 4: info(); break;
			case 0: exit(); return;
			default: System.out.println("잘못된 작업입니다."); break;
			}
		// test
		}
	}

	public void menu() {
		System.out.println("===== 예매프로그램 =====");
		System.out.println("1. 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 조회");
		System.out.println("4. 전체 예매 현황");
		System.out.println("0. 프로그램 종료");
		System.out.println("========================");
	}
	
	private void reservation() {
		System.out.println("원하시는 클래스를 선택하세요");
		System.out.println(Arrays.toString(SEAT_TYPES));
		System.out.print("선택 >> ");
		String choice = sc.next();
		sc.nextLine();
		int temp = -1;
		for (int i = 0; i < SEAT_TYPES.length; i++) {
			if(SEAT_TYPES[i] == choice.charAt(0)) {
				temp = i;
				break;
			}
		}
		if(temp == -1) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		seatGroups[temp].reservation();
	}
	
	private void cancel() {
		System.out.println("원하시는 클래스를 선택하세요");
		System.out.println(Arrays.toString(SEAT_TYPES));
		System.out.print("선택 >> ");
		String choice = sc.next();
		sc.nextLine();
		int temp = -1;
		for (int i = 0; i < SEAT_TYPES.length; i++) {
			if(SEAT_TYPES[i] == choice.charAt(0)) {
				temp = i;
				break;
			}
		}
		if(temp == -1) {
			System.out.println("잘못된 입력입니다");
			return;
		}
		seatGroups[temp].cancel();
	}
	
	private void inquiry() {
		System.out.println("조회할 사용자 이름 입력 >>> ");
		String name = sc.nextLine();
		boolean find = false;
		for (int i = 0; i < seatGroups.length; i++) { // S, R, A, B
			for (int j = 0; j < seatGroups[i].getSeats().length; j++) {
				if(name.equalsIgnoreCase(seatGroups[i].getSeats()[j].getName())) {
					System.out.println("예매 위치");
					System.out.println("클래스   : " + SEAT_TYPES[i]);
					System.out.println("좌석번호 : " + (j + 1) + "번");
					System.out.println("-----------");
					find = true;
				}
			}
		}
		if(find)
			return;
		System.out.println("예매되지 않은 사용자 입니다");
	}
	
	private void info() {
		System.out.println("홀 : " + hallName);
		System.out.println("예매 총액 : " + getTotalCharge());
		for (SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
		}

	}
	
	private int getTotalCharge() {
		int total = 0;
		for (SeatGroup seatGroup : seatGroups)
			total += seatGroup.getTotalCharge();
		return total;
	}

	private void exit() {
		System.out.println(hallName + " 예매프로그램을 종료합니다.");
		sc.close();
	}
}
	

