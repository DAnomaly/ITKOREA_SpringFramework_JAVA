package ex02_loop;

import java.util.Scanner;

public class Quiz03 {
	
	// 1부터 시작하는 모든 정수를 더합니다
	// 합계가 3000이 넘으면 정지합니다
	// 그 결과를 출력합니다
	// 예> 1부터 78까지 더하면 3003입니다
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int result = sc.nextInt();
		sc.close();
		
		int i = 1;
		int sum = 1;
		
		while (true) {
			if((sum += ++i) >= result)
				break;
		}
		
		System.out.println(String.format("1부터 %d까지 더하면 %d입니다", i, sum));
		
	}
}
