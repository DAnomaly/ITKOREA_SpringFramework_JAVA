package ex07_recursive;

public class Adder {

	private int total;
	
	public void calculate(int n) {
		if(n == 0)
			return; // 결과타입이 void인 경우에만 return;을 통해서 메소드를 종료합니다 
		total += n;
		calculate(--n);
	}
	
	public int getTotal() {
		return total;
	}
	
	
}
