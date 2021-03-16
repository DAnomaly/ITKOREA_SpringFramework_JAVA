package ex01_array;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 1. 길이가 3인 String 타입의 배열을 선언하고, 3개의 이름을 입력 받아서 배열에 저장하고 확인하기
		
		String[] names = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(i+1 + "번째 이름 >>");
			names[i] = sc.nextLine();
		}
		
		System.out.print("[ ");
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.print("]");

		sc.close();
	}
}
