package ex01_random;

import java.util.Scanner;

// 2. UpDown게임
// 1 ~ 10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞히는 게임
// 입력 >>> 5000
// UP!
// 입력 >>> 7500
// DOWN!
// 입력 >>> 6250
// CORRECTED!
// TRYED : 3

public class Quiz02 {
	public static void main(String[] args) {
		final int TOP = 10000;
		final int BOTTOM = 1;
		
		int cnt_try = 0;
		int crt_num = (int) (Math.random() * TOP + BOTTOM);
		
		Scanner sc = new Scanner(System.in);
		boolean correct = false;
		
		while(!correct) {
			cnt_try++;
			System.out.print("입력 >>> ");
			int input_num = sc.nextInt();
			if(crt_num != input_num)
				if(crt_num > input_num) 
					System.out.println("UP!");
				else
					System.out.println("DOWN!");
			else 
				correct = true;
			
		}	
		
		System.out.println("CORRECTED!");
		System.out.printf("TRYED : %d",cnt_try);
		
		sc.close();
	}
}
