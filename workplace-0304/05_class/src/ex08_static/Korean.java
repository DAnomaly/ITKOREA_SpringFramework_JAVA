package ex08_static;

public class Korean {

	// field
	public String name; // 인스턴스 필드 ( 인스턴스마다 다릅니다. )
	public static String COUNTRY = "한국"; // 클래스 필드 (모든 인스턴스가 동일합니다.)
	
	// 인스턴스가 10개 있다고 가정하면,
	// 메모리에 
	// name은 10개가 있고, country는 1개가 있습니다.
	
}
