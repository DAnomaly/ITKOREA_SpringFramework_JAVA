package ex02_string;

import java.util.Scanner;

public class Quiz01 {
	/*
	 * 1. 시간을 입력 받아서 출력하기
	 * 시간 >>> 9
	 * 분 >>> 5
	 * 초 >>> 30
	 * 9:05:30입니다
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 >>> ");int hour = sc.nextInt();
		System.out.print("분 >>> ");int minute = sc.nextInt();
		System.out.print("초 >>> ");int second = sc.nextInt();
		sc.close();
		
		if(second >= 60) {
			minute += second / 60;
			second %= 60;
		}
		
		if(minute >= 60) {
			hour += minute / 60;
			minute %= 60;
		}
		
		String str = String.format("%02d:%02d:%02d입니다", hour, minute, second);
		System.out.println(str);
		
	}
	
}

