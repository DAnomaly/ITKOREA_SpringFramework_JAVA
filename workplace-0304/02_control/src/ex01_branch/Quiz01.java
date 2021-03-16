package ex01_branch;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 1. 임의의 양수 1개 임력 받아서 "홀수", "짝수", "3의 배수" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 양수 : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		if(number % 3 == 0) {
			System.out.println("3의 배수");
		}
		
		sc.close();
	}
}
