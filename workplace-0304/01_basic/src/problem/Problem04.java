package problem;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		sc.close();
		
		char temp = 'A';
		
		char[][] addr = new char[rows][rows];
		
		int x = 0;
		int y = 0;
		
		while(true) {
			while(y < rows) {
				addr[y++][x] = temp++;
				if(temp > 'Z')
					temp = 'A';
			}
			
			y--;
			x++;
			if(x >= rows)
				break;
			
			while(y >= 0) {
				addr[y--][x] = temp++;
				if(temp > 'Z')
					temp = 'A';
			}
			
			y++;
			x++;
			if(x >= rows)
				break;
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(addr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
