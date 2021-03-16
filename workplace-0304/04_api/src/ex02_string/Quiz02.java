package ex02_string;

import java.util.Scanner;

public class Quiz02 {

	// 2. 정수/실수 판별하기
	// 입력 >>> 120
	// 120은 정수입니다.
	// 입력 >> 3.14
	// 3.14는 실수 입니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>> "); String str = sc.next();
		
		if(str.indexOf(".") > -1)
			System.out.println(str+"은/는 실수 입니다");
		else
			System.out.println(str+"은/는 정수 입니다");
		
		sc.close();
	}
	
}
