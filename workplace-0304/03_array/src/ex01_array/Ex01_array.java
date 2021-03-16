package ex01_array;

public class Ex01_array {
	
	public static void main(String[] args) {
		
		/*
		 * 배열
		 * 1. 변수가 여러 개 필요할 때 사용합니다
		 * 2. 같은 이름 + 식별 번호를 통해서 표현합니다
		 * 3. 선언
		 * 	 1) int[] i = new int[a];			-- int 타입 변수 a개를 사용할수 있는 배열 i 생성
		 * 	 2) int[] i;
		 * 	    i = new int[a];					-- 1)번과 동일
		 *	 3) int a[] = new int[a];			-- 1)번과 동일 : 추천하지 않음 	
		 * 4. 초기화
		 * 	 ex) int i = 10;
		 *   1) int[] i = {10, 20, 30};
		 *   2) 주의사항 (불가능한 명령어)
		 *   	int[] a;
		 *   	a = {10, 20, 30}; (X)			-- 초기화는 반드시 선언할 때 같이 진행해야 한다.
		 * 5. 생성되는 변수
		 * 	 int[] a = new int[3];
		 *   a[0] : 0으로 초기화가 되어 있는 상태(자동)
		 *   a[1] : 0으로 초기화가 되어 있는 상태(자동)
		 *   a[2] : 0으로 초기화가 되어 있는 상태(자동)
		 * 6. 용어
		 * 	 int[] a = new int[3];
		 * 	 1) 배열이름 : a
		 * 	 2) 배열길이 : 3 (a.length)
		 * 	 3) 인덱스    : 0, 1, 2 ( 0 부터 시작한다 ) 
		 *   	사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException 예외가 발생한다.
		 */
		
		// 1. 배열의 선언 및 생성
		int[] a = new int[3];
		
		// 2. 확인
		System.out.println("------syso------");
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " + a[1]);
		System.out.println("a[2] : " + a[2]);
		
		// 3. 배열의 순회 
		System.out.println("------for문------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(String.format("a[%d] : %d", i, a[i]));
		}
		
		// 4. 가용 범위를 벗어난 인덱스를 사용해 봅니다.
		System.out.println("------a[3]------");
		try {
			System.out.println(a[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
			java.lang.ArrayIndexOutOfBoundsException: 3			-- 인덱스 주소가 올바르지 않다 : 3
			at ex01_array.Ex01_array.main(Ex01_array.java:53)	-- 53번째 줄 오류
		 */
		
	}
	
}
