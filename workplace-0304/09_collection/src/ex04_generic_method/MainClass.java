package ex04_generic_method;

public class MainClass {

	public static void main(String[] args) {

		Integer[] is = { 6, 5, 7, 3, 5 };
		Double[] ds = { 6.5, 9.0, 3.25, 6.0 };
		String[] ss = { "hello", "hi", "how", "are", "you" };

		Calculator cal = new Calculator();
		
		System.out.println(cal.getTotal(is));
		System.out.println(cal.getTotal2(ds));
		// System.out.println(cal.getTotal(ss)); // 실행 오류 (ClassCastException) : Casting 실패 (String -> Number (X) )
		// System.out.println(cal.getTotal2(ss)); // 컴파일 에러 : String[]을 받을 수 없습니다 
		
	}

}
