package problem;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 : ");
		Long input_sec = sc.nextLong();
		
		sc.close();
		
		Long days = input_sec / 60 / 60 / 24 ;
		int hours = (int)(input_sec / 60 / 60 % 24);
		int mins = (int)(input_sec / 60 % 60);
		int sec = (int)(input_sec % 60);
		
		System.out.println(days + ":" + hours + ":" + mins + ":" + sec);
		
		
	}
}
