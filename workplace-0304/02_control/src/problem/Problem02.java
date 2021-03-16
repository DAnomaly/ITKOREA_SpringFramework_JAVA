package problem;

import java.util.Scanner;

public class Problem02 {

	// 이진수를 입력받아 10진수로 출력하시오
	
	public static void main(String[] args) {
		
		System.out.print("이진수 >> ");
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		sc.close();
		
		char[] num = new char[number.length()];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = number.charAt(num.length - i - 1);
		}
		
		int score = 0;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == '1')
				score += Math.pow(2, i);
		}
		
		System.out.println("정수 : " + score);
		
	}
	
}
