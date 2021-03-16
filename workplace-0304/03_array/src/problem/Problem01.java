package problem;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		System.out.print("값을 입력하세요 >> ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("1 : 2진수 | 2 : 8진수 | 3 : 16진수");
		int answer;
		do {
			System.out.print("원하는 진수 출력 >> ");
			answer = sc.nextInt();
		} while (answer < 1 || answer > 3);
		
		
		String result = "";
		int num = number;
		switch (answer) {
		case 1:
			while(num >= 2) {
				result += num % 2;
				num /= 2;
			};
			result += num;
			break;
		case 2:
			while(num >= 8) {
				result += num % 8;
				num /= 8;
			};
			result += num;
			break;
		case 3:
			while(num >= 16) {
				int temp = num % 16;
				if(temp >= 10) {
					char input = (char)('A' + temp % 10);
					result += input;
				}else {
					result += temp;
				}
				num /= 16;
			};
			int temp = num % 16;
			if(temp >= 10) {
				char input = (char)('A' + temp % 10);
				result += input;
			}else {
				result += temp;
			}
			
			break;
			
		}
		result = new StringBuffer(result).reverse().toString();
		System.out.println(result);
		
		sc.close();
	}
	
}
