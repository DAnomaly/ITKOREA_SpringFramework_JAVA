package problem;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = 0;
		int e = 0;
		
		while(true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if(!(s < 2 || e < 2 || s > 9 || e > 9)) {
				break;
			}
			System.out.println("INPUT ERROR!");
		}
		
		boolean line = true;
		if (s > e) {
			line = false;
		}
		
		for (int i = 1; i <= 9; i++) {
			int a = s;
			while(true) {
				String result = "" + a*i;
				if(a*i < 10) {
					result = " " + a*i;
				}
				System.out.print(a + " * " + i + " = " + result);
				if(a == e) {
					System.out.println();
					break;
				}else {
					if(line) {
						a++;
					}else {
						a--;
					}
				}
				System.out.print("   ");
			}
		}
		
		sc.close();
		
	}
	
}
