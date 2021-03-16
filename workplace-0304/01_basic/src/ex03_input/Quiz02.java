package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 2. double 타입의 실수 2개 입력 받아서 값을 교환하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a : ");
		double a = sc.nextDouble();
		System.out.print("b : ");
		double b = sc.nextDouble();
		
		double n = a;
		a = b;
		b = n;
		System.out.println("a : " + a + ", b : " + b);
		
		sc.close();
	}
}
