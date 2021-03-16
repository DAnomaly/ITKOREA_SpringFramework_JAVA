package ex02_operator;

public class Ex01_operator {
	
	public static void main(String[] args) {
		
		// 1. 산술연산자 : +, -, *, /, %
		System.out.println(7 + 2); // 9
		System.out.println(7 - 2); // 5
		System.out.println(7 * 2); // 14
		System.out.println(7 / 2); // 3
		System.out.println(7 % 2); // 1
		
		System.out.println(7.0/2.0); // 3.5
		
		// 2. 증감연산자: ++, --
		int a = 10;
		System.out.println(++a); // 11, a을 먼저 증가시키고 출력합니다.
		System.out.println(a++); // 11, a을 먼저 출력하고 증가시킵니다.
		int b = 10;
		System.out.println(--b); // 9, b을 먼저 감소시키고 출력합니다.
		System.out.println(b--); // 9, b을 먼저 출력하고 감소시킵니다.
		System.out.println(a+b); // 20, 12 + 8로 연산된 결과입니다.
		
		// 3. 대입연산자 : =, +=, -=, *=, /=, %=
		// 문제) x와 y을 교환해 봅니다.
		int x = 1;
		int y = 2;
		
		int n = x;
		x = y;
		y = n;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		
		// a += 1 : a = a + 1
		// a -= 1 : a = a - 1
		// a *= 1 : a = a * 1
		// a /= 1 : a = a / 1
		// a %= 1 : a = a % 1
		// 문제. money를 5% 증가시켜보세요.
		int money = 100;
		money *= 1.05;
		System.out.println(money);
		
		
	}
	
	
}
