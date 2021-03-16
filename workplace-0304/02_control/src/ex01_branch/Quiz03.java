package ex01_branch;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 3. switch, 나이 입력 받아서 "성인", "미성년자"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int number = sc.nextInt();
		
		switch (number / 20) {
		case 0:
			System.out.println("미성년자");
			break;

		default:
			System.out.println("성인");
			break;
		}
		
		sc.close();
	}
}
