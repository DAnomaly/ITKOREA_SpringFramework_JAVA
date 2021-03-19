package quiz01;

public class Calcurator {

	int result;
	
	//	constructor 
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

	public void division(int a) {
		result /= a;
		info();
	}
	
	public void info() {
		System.out.println("result: " + result);
	}
	

}
