package ex01_variable;

public class Ex03_primitive_type {
	
	public static void main(String[] args) {
		
		// 정수 타입
		
		// 1. byte
		// 크기 1바이트, 단독 사용은 아니고 배열로 사용
		System.out.println("Byte-MAX_VALUE : " + Byte.MAX_VALUE); // 127
		System.out.println("Byte-MIN_VALUE : " + Byte.MIN_VALUE); // -128
		System.out.println("Byte-SIZE : " + Byte.SIZE); // 8
		
		// 비트에 의한 값의 범위
		// 8비트 : -2의 7제곱 ~ 2의 7제곱 -1
		// n비트 : -2의 (n-1)제곱 ~ 2의 n-1제곱 -1
		
		// 2. short 타입
		// 학습할 필요가 없음
		
		// 3. int 타입
		// 크기 4바이트, 일반적인 기본 정수 자료형
		System.out.println("Integer-MAX_VALUE : " + Integer.MAX_VALUE); // 2147483647
		System.out.println("Integer-MIN_VALUE : " + Integer.MIN_VALUE); // -2147483648
		System.out.println("Integer-SIZE : " + Integer.SIZE); // 32
		
		// 4. long 타입
		// 크기 8바이트, int보다 큰 정수 자료형
		System.out.println("Long-MAX_VALUE : " + Long.MAX_VALUE); // 9223372036854775807
		System.out.println("Long-MIN_VALUE : " + Long.MIN_VALUE); // -9223372036854775808
		System.out.println("Long-SIZE : " + Long.SIZE); // 64
		
		// 실수 타입
		// 1. float 타입
		// 크기 : 4바이트, 과거 호환용
		
		// 2. double 타입
		// 크기 : 8바이트
		System.out.println("Double-MAX_VALUE : " + Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println("Double-MIN_VALUE : " + Double.MIN_VALUE); // 4.9E-324
		System.out.println("Double-MIN_EXPONENT : " + Double.MAX_EXPONENT); // 1023
		System.out.println("Double-MIN_EXPONENT : " + Double.MIN_EXPONENT); // -1022
		System.out.println("Double-SIZE : " + Double.SIZE); // 64
		
		// 부호, 소수부, 지수부
		// 항상 소수 자리수는 부정확할 수 있다. (BigDecimal 클래스를 이용해서 정확히 표현할 수 있다.)
		
		// 문자 타입
		// 1. char
		// 크기 2바이트, 유니코드 기반 (국제 표준 코드)
		System.out.println("Character-SIZE : " + Character.SIZE); // 16
		
		// 논리 타입
		// 1. boolean
		// 크기 : 이론상으로는 1비트(참, 거짓만 표현하면 되므로)
		
		// 변수 선언
		int a  = 10;
		long b = 12345678900L;
		char c = 'a';
		float d = 1.5F;
		double e = 1.5*2;
		boolean f = true;
		
		// primitive type은 변수에 데이터가 그대로 저장됩니다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
	
}
