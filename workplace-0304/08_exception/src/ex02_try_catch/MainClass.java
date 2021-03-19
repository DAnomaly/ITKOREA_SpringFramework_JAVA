package ex02_try_catch;

public class MainClass {
	/*
	// try{
		코드작성
		예외발생가능구역
	*/
	public static void main(String[] args) {
		int a = 10;
		try{
			a = a / 0;
		}catch (ArithmeticException e){
			System.out.println(0);
		}
		
		String name = null;
		try {
				name.equals("james");
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다");
		}
		
	}

	
	
	
	
}
