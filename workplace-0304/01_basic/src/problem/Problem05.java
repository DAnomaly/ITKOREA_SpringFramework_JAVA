package problem;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		
		int num = sc.nextInt();
		
		sc.close();
		
		char[] arr = new char[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = data.charAt(i*2);
		}
		
		for (int i = 0; i < num; i++) {
			int tempAddr = i;
			for (int j = i+1; j < num; j++) {
				if(arr[tempAddr] > arr[j]) {
					tempAddr = j;
				}
			}
			if(tempAddr != i) {
				char temp = arr[i];
				arr[i] = arr[tempAddr];
				arr[tempAddr] = temp;
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	
	
}
