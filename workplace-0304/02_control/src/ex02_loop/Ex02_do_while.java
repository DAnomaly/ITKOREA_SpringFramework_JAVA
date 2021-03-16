package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {

		// do - while 문
		// 1. while문입니다
		// 2. 반드시 한 번은 실행하는 while문입니다
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 0;
		
		do {
			System.out.print("정수를 입력하세요 >> ");
			n = sc.nextInt();
			total += n;
		} while (n > 0);
		total -= n;
		System.out.println("합 계 : " + total);
		
		sc.close();
		
	}
}
