package ex05_throw;

public class Calcurator {

	int result;

	// constructor
	public Calcurator(int result) {
		super();
		this.result = result;
	}

	// method
	public void addition(int a) {
		result += a;
		info();
	}

	public void subtraction(int a) {
		result -= a;
		info();
	}

	public void multiplication(int a) {
		result *= a;
		info();
	}

	public void division(int a) throws ArithmeticException { // 2. division() 메소드가 어떤 예외를 던지는지 명시합니다.
		if(a == 0) {
			throw new ArithmeticException(); // 1. 예외를 직접 던집니다
		}
		result /= a;
		info();
	}

	public void info() {
		System.out.println("result: " + result);
	}

}
