package ex04_generic_method;

public class Calculator {

	// method
	public <T> double getTotal(T[] a) {
		// T : Integer OR Float OR Double
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += ((Number)a[i]).doubleValue();
		}
		return total;
	}
	
	public <T extends Number> double getTotal2(T[] a) {
		// T는 Number를 상속받는 클래스만 가능합니다.
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i].doubleValue();
		}
		return total;
	}
	
}
