package ex01_random;

public class Ex02_Math {

	public static void main(String[] args) {

		// java.lang.Math
		System.out.println(Math.random()); // new Random().nextDouble()과 동일 ( 0.0 < Math.random() < 1.0 )

		// Math.random() 의 결과가 0.1보다 작을 확률은 얼마일까요? 10%
		// Math.random() 의 결과가 0.2보다 작을 확률은 얼마일까요? 20%

		// 10% 확률로 "강화성공", "강화실패"
		System.out.println("\n----- 강화시도 -----");
		if (Math.random() < 0.1) {
			System.out.println("강화성공");
		} else {
			System.out.println("강화실패");
		}

		// Math.random() 				0.0 <= n < 	1.0
		// Math.random()*3 				0.0 <= n < 	3.0
		// (int)(Math.random()*3)		0 	<= n < 	3	( 0, 1, 2 )
		// (int)(Math.random()*3) + 1  	1   <= n < 	4	( 1, 2, 3 )
		
		// 일반화해서 공식처럼 활용합니다
		// 원하는 난수의 범위
		// (int)(Math.random() * 개수) + 시작값
		
		// 주사위 : (int)(Math.random() * 6) + 1
		// 로또	: (int)(Math.random() * 45) + 1
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println(lotto);
		
	}

}
