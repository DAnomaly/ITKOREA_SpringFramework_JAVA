package quiz02;

public class MainClass {


	public static void main(String[] args) {
		
		Calculator calc; // 객체는 업속, 참조 변수만 있는 상태입니다.
		
		// 객체를 만드는 명령은 "new"입니다.
		
		calc = new Calculator(); // 객체가 만들어지고, 그 참조 값이 calc에 전달됩니다.
								 // 객체가 만들어지는 시점을 "인스턴스화"

		calc.addtion(1, 2);
		
		int a = 5;
		int b = 10;
		if(a >= b) 
			System.out.printf("%d - %d = %d\n",a,b,calc.subtraction(a, b));
		else
			System.out.printf("%d - %d = %d\n",b,a,calc.subtraction(a, b));
		
	}
	
}
