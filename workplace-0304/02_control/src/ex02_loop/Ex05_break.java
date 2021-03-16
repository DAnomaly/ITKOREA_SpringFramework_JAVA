package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {

		// 2. loop문을 종료합니다
		
		// 주요 사용
		// 무한루프 + break문
		
		// 무한루프
		// 1. while (true) { } -- 추천
		// 2. for ( ; ; ) { }
		
		Scanner sc = new Scanner(System.in);
		
		String city = null;
		
		while(true) {
			System.out.print("대한민국의 수도는? >>> ");
			city = sc.next();
			
			if(city.equals("서울") || city.equalsIgnoreCase("seoul")) {
				System.out.println("정답입니다");
				break;
			}else {
				System.out.println("오답입니다");
			}
				
		}
		
		
		sc.close();
		
	}
	
}
