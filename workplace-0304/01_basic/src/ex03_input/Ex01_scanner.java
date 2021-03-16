package ex03_input;

import java.util.Scanner;

public class Ex01_scanner {

	public static void main(String[] args) {
		
		// Scanner 클래스
		// 1. 패키지 : java.util
		// 2. import가 필요합니다.
		// 	  - import가 필요 없는 패키지 : java.lang 
		// 3. 메소드
		// 	  1) nextInt() : int 입력
		//    2) nextLong() : long 입력
		// 	  3) nextDouble() : double 입력
		//    4) next() : String 입력 (공백 없는 String)
		//    5) nextLine() : String 입력 (공백 있는 String)
		
		// 입력을 위해서는 "표준 입력 스트림"을 사용합니다.
		// 표준 입력 스트림 : System.in
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 이름 입력하기
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		// 2. 나이 입력하기
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		// 3. 키 입력하기
		System.out.println("키를 입력하세요");
		double height = sc.nextDouble();
		
		// 4. 성별 입력하기 (남 / 여)
		System.out.println("성별을 입력하세요 (남/여)");
		char gender = sc.next().charAt(0);
		
		// 5. 정보 확인하기
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
		
		// 6. 스트림 닫기
		sc.close(); // 생략이 가능합니다.
		
	}
	
}
