package ex01_branch;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 2. 나이를 입력 받아서 구분 출력
		//	  7이하   : "미취학아동"
		//	  13이하 : "초등학생"
		//	  16이하 : "중학생"
		//	  19이하 : "고등학생"
		//	  20이상 : "성인"
		//    나이 범위 (1~100)를 벗어나면 : "불가능한 나이"
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int number = sc.nextInt();
		
		sc.close();
		
		if(number < 1 || number > 100 )
			System.out.println("불가능한 나이");
		else if(number <= 7) 
			System.out.println("미취학아동");
		else if(number <= 13) 
			System.out.println("초등학생");
		else if(number <= 16)
			System.out.println("중학생");
		else if(number <= 19)
			System.out.println("고등학생");
		else
			System.out.println("성인");
		
	}
}
