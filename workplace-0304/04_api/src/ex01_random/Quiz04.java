package ex01_random;

import java.util.Scanner;

// 4. 가위바위보
// 가위바위보 >>> 가위
// 

public class Quiz04 {
	
	final static int SCISSORS = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	public static void main(String[] args) {

		int cnt_win = 0;
		int cnt_draw = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("1) 가위\t 2) 바위\t 3) 보");
		
		out : while (true) {
			int com_choice = (int) (Math.random() * 3 + 1);
			System.out.print("선택 >>> ");
			int user_choice = sc.nextInt();
			if(user_choice < 1 || user_choice > 3) {
				System.out.println("잘못된 값입니다");
				continue out;
			}
			switch (com_choice - user_choice) {
			case -1:
			case 2:
				System.out.printf("USER %s : %s COM | 이겼습니다\n", what(user_choice), what(com_choice));
				cnt_win++;
				break;
			case 0:
				System.out.printf("USER %s : %s COM | 비겼습니다\n", what(user_choice), what(com_choice));
				cnt_draw++;
				break;
			default:
				System.out.printf("USER %s : %s COM | 졌습니다\n", what(user_choice), what(com_choice));
				break out;
			}
		}
		System.out.printf("PLAY : %d |WIN : %d | DRAW : %d", cnt_win + cnt_draw + 1, cnt_win, cnt_draw);

		sc.close();
	}

	public static String what(int choice) {
		String result = null;
		switch (choice) {
		case SCISSORS:
			result = "가위";
			break;
		case ROCK:
			result = "바위";
			break;
		case PAPER:
			result = "보";
			break;
		}
		return result;
	}
}
