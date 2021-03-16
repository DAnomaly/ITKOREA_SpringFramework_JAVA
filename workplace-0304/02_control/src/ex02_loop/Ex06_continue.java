package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue문
		// 1. loop문으로 되돌아가서 다시 실행합니다
		// 2. continue문 이후의 코드를 실행하지 않기 위해서 사용합니다
		
		/*
		int n = 1;
		while(n <= 10) {
			if(n % 2 == 1) {
				System.out.println(n);
			}
			n++;
		}
		*/
		
		/*
		int n = 0;
		while (n <= 10) {
			n++;
			if(n % 2 == 0) {
				continue;
			}
			System.out.println(n);
				
		}
		*/
		
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		// 소원을 3개 들어줍니다
		// 안 되는 소원은 "로또당첨"입니다. 나머지 소원은 모두 들어줍니다
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print(i+1+"번 소원 >> ");
			String wish = sc.nextLine();
			if(wish.equalsIgnoreCase("로또당첨")) {
				System.out.println("들어줄수 없는 소원입니다.");
				i--;
				continue;
			}
			System.out.println("정상 등록되었습니다");
		}
		sc.close();
		
	}
	
}
