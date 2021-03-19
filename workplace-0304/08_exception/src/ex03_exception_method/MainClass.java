package ex03_exception_method;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			// int a = 2 / 0;
			Integer.parseInt("1.5");
		} catch (RuntimeException e) {
			System.out.println("예외메시지: " + e.getMessage());
			System.out.println("===========");
			e.printStackTrace(); // 개발자가 넣어 두는 코드
		}
		
	}
	
}
