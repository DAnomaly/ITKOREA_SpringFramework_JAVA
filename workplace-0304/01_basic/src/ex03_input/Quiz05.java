package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 성별을 의미하는 숫자(1~4)를 입력 받아서 "남", "여" 구분 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자(1~4)를 입력 : ");
		int genderNum = sc.nextInt();
		
		System.out.println(genderNum == 1 || genderNum == 3 ? "남" : "여");
		
		sc.close();
	}
}
