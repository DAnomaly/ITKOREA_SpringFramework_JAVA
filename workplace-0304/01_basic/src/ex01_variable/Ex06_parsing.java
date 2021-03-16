package ex01_variable;

public class Ex06_parsing {

	public static void main(String[] args) {
	
		// String 타입 변환은 parsing입니다.
		
		/*
		int a = 10;
		System.out.println((String)a); // casting이 안됩니다.		
		
		String b = "10";
		System.out.println((int)b); // casting이 안됩니다.
		*/
		
		// 1. 정수int를 문자열String으로 변환하기
		int a = 10;
		String a1 = String.valueOf(a);
		String a2 = a + ""; // 문자열의 +연산은 연결입니다. 결과도 문자열입니다.
		System.out.println(a1);
		System.out.println(a2);
		
		// 2. 문자열String을 정수int로 변환하기
		String b = "123";
		int bb = Integer.parseInt(b);
		System.out.println(bb);
		
		// 3. 문자열String을 실수double로 변환하기
		String c = "1.5";
		double cc = Double.parseDouble(c);
		System.out.println(cc);
						
	}
	
}
