package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	/*
	 * 점수를 입력 받아서 해당하는 학점을 출력하시오.
	 * char grade : 'S' 'A' 'B' 'C' 'F'
	 * char point : '+' '0' '-' ' '
	 * 
	 * 100     : S
	 * 99 - 97 : A+
	 * 96 - 94 : A0
	 * 93 - 90 : A-
	 * 89 - 87 : B+
	 * 86 - 84 : B0
	 * 83 - 80 : B-
	 * 79 - 77 : C+
	 * 76 - 74 : C0
	 * 73 - 70 : C-
	 * 69 - 00 : F
	 */
	
	public static void main(String[] args) {
		
		System.out.print("점수 입력 >> ");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		System.out.print("GRADE : ");
		
		switch (score / 10) {
		case 10:
			System.out.print("S");
			break;
		case 9:
		case 8:
		case 7:
			System.out.print( (char)('C'- (score/10 - 7)) );
			switch (score - score / 10 * 10) {
			case 9:
			case 8:
			case 7:
				System.out.print("+");
				break;
			case 6:
			case 5:
			case 4:
				System.out.println("0");
				break;
			default:
				System.out.println("-");
				break;
			}
			break;
		default:
			if(score > 100 || score < 0) {
				System.out.println("잘못된 값");
				break;
			}
			System.out.print("F");
			break;
		}
		
	}
	
}
