package problem;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("height : ");
		int height = sc.nextInt();
		System.out.print("type : ");
		int type = sc.nextInt();
		
		sc.close();
		
		if(height > 100 || height < 0 || type < 0 || type > 3) {
			System.out.println("[ 알맞지 않은 입력 ]");
			return;
		}
		
		switch (type) {
		case 1:
			for (int i = 0; i < height; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < height-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		default:
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < height - i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i*2; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			break;
		}
		
	}
	
	
}
