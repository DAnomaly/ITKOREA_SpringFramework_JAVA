package ex08_static;

public class MyMath {
	
	// private 생성자 -> MyMath 내부에서만 생성이 가능합니다.
	// constructor
	private MyMath() {	}

	// static field
	public static final double PI = 3.141592;

	// static method
	public static double abs(double n) {
		return n > 0 ? n : -n;
	}
	
	public static double pow(double n, int a) {
		int result = 1;
		for (int i = 0; i < a; i++) {
			result *= n;
		}
		return result;
	}
	
}
