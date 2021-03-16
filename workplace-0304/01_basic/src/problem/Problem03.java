package problem;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("높이 : ");

		int h = sc.nextInt();

		System.out.print("너비 : ");

		int w = sc.nextInt();
		
		sc.close();

		// 좌표 생성
		int[][] arr = new int[h][w];

		int x = 0;
		int y = 0;

		int num = 1;

		// 좌표에 숫자 대입
		while (true) {
			
			while (x < w) {
				arr[y][x++] = num++;
			}
			y++;
			x--;
			if (y >= h)
				break;
			
			while (x >= 0) {
				arr[y][x--] = num++;
			}
			y++;
			x++;
			if (y >= h)
				break;
		}
		
		// 출력 :
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
