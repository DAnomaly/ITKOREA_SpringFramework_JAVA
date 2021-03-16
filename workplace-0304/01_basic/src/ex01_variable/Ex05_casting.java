package ex01_variable;

public class Ex05_casting {
	
	public static void main(String[] args) {
	
		// casting : 다른 타입(자료형)으로 전환하는 것
		
		// 자동 형변환 (promotion)
		System.out.println(1+1.5); // 1 + 1.5 -> promotion으로 1.0 + 1.5
		
		// 강제 형변환 (casting)
		int a = 1;
		double b = 1.5;
		System.out.println(a + (int)b); // b를 잠시 int 형으로 변환
		
		
	}
	
}
