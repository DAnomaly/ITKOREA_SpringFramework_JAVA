package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
		
		Calcurator calcurator = new Calcurator(0);
		
		// 예외를 직접 발생시키는 경우 throw를 이용합니다.
		try {
			calcurator.division(0);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다." + e );
		}
		
		
		
	}
	
	
}
