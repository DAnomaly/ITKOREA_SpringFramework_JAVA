package ex02_loop;

import java.util.Scanner;

public class Quiz01 {
	
	// 1. 퀴즈 맞히기
	// 맞힐때까지 계속 물어보는 퀴즈입니다
	// 대한민국의 수도는 ? >> 인천
	// 오답입니다
	// 대한민국의 수도는 ? >> 서울 또는 Seoul
	// 정답입니다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final boolean ANSWER = true;
		final boolean WRONG_ANSWER = false;
 		
		boolean result = WRONG_ANSWER; // 답 결과
		
		do {
			System.out.print("대한민국의 수도는 ? >> ");
			String answer = sc.next();
			
			if(answer.equalsIgnoreCase("서울") || answer.equalsIgnoreCase("seoul")) {
				System.out.println("정답입니다");
				result = ANSWER;
			} else {
				System.out.println("오답입니다");
			}
			
		} while (result == WRONG_ANSWER);
					
		sc.close();
	}
}
