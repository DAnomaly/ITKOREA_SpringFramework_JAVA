package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		
		// 무한루프 만들기
		while (true) {
			System.out.println("무한루프입니다.");
			break;
		}
		
		// 1 ~ 10 출력
		int n1 = 1;
		while (n1 <= 10) {
			System.out.print(n1++ + "  ");			
		}
		System.out.println();
		// 10 ~ 1 출력
		int n2 = 10;
		while (n2 > 0) {
			System.out.print(n2-- + " ");
		}
		
		Scanner sc = new Scanner(System.in);

		/*
		// 'A' ~ 'Z' 사이를 계속 입력 받는 프로그램
		// 대문자가 입력되지 않으면 종료합니다.
		char ch = 'A';
		while ( ch >= 'A' && ch <= 'Z') {
			System.out.print("대문자 입력 >>> ");
			ch = sc.next().charAt(0);
		}
		*/
		
		// 입력 받은 정수를 모두 더해줍니다.
		// 0 이상은 모두 더해주고, 음수가 입력되면 그만합니다.
		// 합계를 출력해 봅시다.
		int resultSum = 0;
		int answer = 0;
		while (answer >= 0) {
			System.out.print("숫자 입력 >> ");
			answer = sc.nextInt();
			resultSum += answer;
		}
		
		resultSum -= answer;
		
		System.out.println("총합 : " + resultSum);
		
		sc.close();
		
	}
	
}
