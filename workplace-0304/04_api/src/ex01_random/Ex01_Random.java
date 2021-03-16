package ex01_random;

import java.util.Random;

public class Ex01_Random {
	
	public static void main(String[] args) {
		
		// java.util.Random
		Random random = new Random();
		
		int rand1 = random.nextInt();	// int 범위 내 랜덤
		int rand2 = random.nextInt(10); // 0 ~ 9 (10개 중 하나)
		
		System.out.printf("rand1 : %d \n",rand1);
		System.out.printf("rand2 : %d \n",rand2);
		
		double rand3 = random.nextDouble(); // 0 <= 난수 < 1

		System.out.printf("rand3 : %f \n",rand3);
		
		
	}
	
}
