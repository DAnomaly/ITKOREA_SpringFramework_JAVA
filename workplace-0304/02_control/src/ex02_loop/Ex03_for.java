package ex02_loop;

public class Ex03_for {
	
	public static void main(String[] args) {
		
		// for문
		// 1. 반복의 횟수나 범위가 명확할 때 사용합니다.
		// 2. 배열이나 리스트와 같은 반복가능객체(iterable)에서 사용합니다.
		// 3. 동작 순서
		// for ( ① ; ② ; ④ ; ){ ③ }
		// ① 은 최초 1회만 작동합니다
		// ②, ③, ④는 조건식에 따라 계속 반복한다
		
		// 1 ~ 10 출력
		System.out.print("1 ~ 10 출력 : [ "); 
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
		// 10 ~ 1 출력
		System.out.print("10 ~ 1 출력 : [ "); 
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
		
		System.out.println(); // 줄 바꿈
		
		
		// 3번 "Hello Java"를 출력하는 for문을 작성해 봅니다.
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello Java");
		}
		
	}
	
}
