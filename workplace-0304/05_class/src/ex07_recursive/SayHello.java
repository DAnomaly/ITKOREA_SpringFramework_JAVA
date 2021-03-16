package ex07_recursive;

public class SayHello {

	public void say(int n) {
		if(n > 0) {
			System.out.println("Hello");
			say(--n); // 재귀적 호출
		}
	}
	
	
	
}
