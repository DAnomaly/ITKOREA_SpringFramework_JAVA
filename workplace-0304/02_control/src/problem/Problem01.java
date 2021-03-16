package problem;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		
		// 소수( prime number ) 인가, 합성수( composite number ) 인가
		
		System.out.print("자연수 입력 >> ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		boolean isPrimeNumber = true;
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		
		if(number == 1)
			System.out.println("NUMBER ONE");
		else if(isPrimeNumber)
			System.out.println("PRIME NUMBER");
		else
			System.out.println("COMPOSITE NUMBER");
		
	}
}
