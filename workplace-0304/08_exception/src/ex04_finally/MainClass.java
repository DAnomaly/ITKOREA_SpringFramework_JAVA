package ex04_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		try {
			System.out.print("정수를 입력하세요 >>> ");
			a = sc.nextInt();
		} catch (Exception e) {
		 	e.printStackTrace();
		} finally {
			System.out.println(a);
			sc.close();
		}
		
	}
	
	
}
