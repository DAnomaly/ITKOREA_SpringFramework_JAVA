package quiz12;

import java.util.Scanner;

public class SeatGroup {
	
	// field
	private char seatType; // 'S' 'R' 'A' 'B'
	private int charge; // 요금
	private Seat[] seats;
	private Scanner sc = new Scanner(System.in);

	// constructor
	public SeatGroup(char seatType, int charge, int seatCount) {
		this.seatType = seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount]; // 배열 생성
		// 배열에 실제 Seat 생성
		for (int i = 0; i < seatCount; i++) {
			seats[i] = new Seat(); // 빈 좌석 생성
		}
	}

	// method
	// 1. 예매 하기
	//    1) 결과타입 : boolean (성공 true, 실패 false)
	//	  2) 메소드명 : reservation
	//    3) 매개변수 : 없다.
	public boolean reservation() {
			if(!check_reservation()) {
				System.out.println("이 클레스에서 예매할 좌석이 존재하지 않습니다");
				return false;
			}
			// 0. 좌석 번호를 받기
			System.out.print("예매할 좌석 번호 >>> ");
			int seatNum = sc.nextInt();
			sc.nextLine();
			// 1. Null 체크
			if (seatNum > seats.length || seatNum < 1) { 
				System.out.println(seatNum + "번 좌석은 존재하지 않는 좌석입니다");
				return false;
			}
			// 2. 좌석 예약 체크
			if (seats[seatNum - 1].check()) { 
				// 3. 예매 하기
				System.out.print("예매자의 이름을 입력세요 >>> ");
				String name = sc.nextLine();
				seats[seatNum -1].setName(name);
				System.out.println(seatNum + "번 좌석이 " + name + "님에게 예약되었습니다. 감사합니다.");
				return true;
			} else {
				System.out.println(seatNum + "번 좌석은 이미 예약된 좌석입니다");
				return false;
			}
	}
	
	// o. 예매 가능한 자리가 존재하는지 체크
	private boolean check_reservation() {
		for (Seat seat : seats) {
			if(seat.check())
				return true;
		}
		return false;
	}
	
	// 2. 예매 취소
	//    1) 결과타입 : boolean (성공 true, 실패 false)
	//	  2) 메소드명 : cancel
	//    3) 매개변수 : 없다.
	public boolean cancel() {
		// 0. 좌석 번호를 받기
		System.out.print("취소할 분의 이름을 입력 >>> ");
		String name = sc.nextLine();
		// 1. 좌석 예매 취소
		w1: while (true) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i].getName().equalsIgnoreCase(name)) {
					System.out.println("예매를 취소하시겠습니까?(Y/N) >>> ");
					String yesNo = sc.next();
					sc.nextLine();
					yesNo = yesNo.charAt(0) + "";
					if (yesNo.equals("Y")) {
						seats[i].cancel();
						System.out.println("정상적으로 예매가 취소되었습니다");
						return true;
					} else if (yesNo.equals("N")) {
						System.out.println("현제 작업을 취소하였습니다");
						return false;
					} else {
						System.out.println("잘못된 입력입니다");
						continue w1;
					}
				}
			}
			break;
		}
		// 2. null 체크
		System.out.println("예매하신 좌석을 찾을 수 없습니다");
		return false;
	}
	
	// 3. 예매 현황 출력
	public void info() {
		System.out.println(seatType + " : ");
		for (int i = 0; i < seats.length; i++) {
			System.out.print("SEAT" + (i + 1) + " : ");
			seats[i].info();
		}
	}
	
	// 4. 예매 총액 반환
	public int getTotalCharge() {
		int total = 0;
		for (Seat seat : seats) 
			if(!seat.check())
				total += charge;
		return total;
	}
	
	public Seat[] getSeats() {
		return seats;
	}
}
