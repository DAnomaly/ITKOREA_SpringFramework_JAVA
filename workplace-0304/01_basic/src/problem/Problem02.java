package problem;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		char[][] arr = new char[i][i];
		
		
		char start = 'A';
		int x = 0;
		int y = 0;
		
		while(true) {
			if(x+y+1 >= i)
				arr[x][y] = start++;
			else
				arr[x][y] = 0;
			
			y++;
			
			if(start > 'Z')
				start = 'A';
			
			if(y >= i) {
				x++;
				y = 0;
			}
			
			if(x >= i)
				break;
			
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr.length; j2++) {
				System.out.print(arr[j][j2] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
	
}
