package ex03_input;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
	
		// 1. int 타입의 정수를 3개 입력 받아서 평균 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int c = sc.nextInt();
		
		System.out.print("평균 : ");
		double result = (a + b + c) / 3.0;
		System.out.println(Math.round(result*100)/100.0);
		
		sc.close();
		
	}
	
}
