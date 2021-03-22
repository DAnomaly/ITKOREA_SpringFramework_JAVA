package ex08_static;

public class KoreanMainClass {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Korean korean1 = new Korean();
		
		korean1.name = "홍길동";
		
		System.out.println("korean1.COUNTRY: " + korean1.COUNTRY); // 1) 인스턴스로 접근 (추천하지 않습니다)
		System.out.println("Korean.COUNTRY: " + Korean.COUNTRY); // 2) 클래스로 접근
		
	}
	
	
}
