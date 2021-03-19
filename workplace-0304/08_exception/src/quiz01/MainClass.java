package quiz01;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calcurator cal = new Calcurator(5);
		
		try {
			cal.addition(10);
			cal.subtraction(5);
			cal.multiplication(2);
			cal.division(0);
		} catch (ArithmeticException e) {
			System.out.println("예외가 발생했습니다");
		}
		
		
		
		
		
		
	}
	
	

}
