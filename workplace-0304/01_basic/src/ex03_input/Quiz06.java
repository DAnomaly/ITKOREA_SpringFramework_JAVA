package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// 주민번호(하이픈 없이) 전체 입력 받아서 "남", "여" 구분 출력하기
		System.out.print("주민번호(하이픈 없이) 입력 : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		char i = num.charAt(6);
		
		System.out.println( i == '1' || i == '3' ? "남" : "여");
		
		sc.close();
	}
}
