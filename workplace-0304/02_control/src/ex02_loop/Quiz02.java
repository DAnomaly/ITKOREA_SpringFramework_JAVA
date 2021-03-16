package ex02_loop;

import java.util.Scanner;

public class Quiz02 {
	
	// 2. 영화 평점을 입력받아서 ★을 출력
	// 평점은 1~5 사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = 1;
		
		while(true) {
			System.out.print("평점을 입력해 주세요 >> ");
			score = sc.nextInt();
			if(score > 5 || score < 1)
				System.out.println("[ 잘못된 입력값입니다 ]");
			else
				break;
		} 
		
		sc.close();
		
		System.out.print("평점 : ");
		for (int i = 0; i < score; i++) {
			System.out.print("★ ");
		}
		
		for (int i = score; i < 5; i++) {
			System.out.print("☆ ");
			
		}
		
	}
}
