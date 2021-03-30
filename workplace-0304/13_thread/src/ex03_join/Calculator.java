package ex03_join;

public class Calculator extends Thread{

	// field
	private int result;
	int from;
	int to;
	
	// constructor
	public Calculator(int from, int to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	public void run() {
		addition();
	}
	
	// method
	public void addition() {
		// from부터 to까지 모든 정수 더해서 result에 저장
		if (from > to) {
			int temp = from;
			from = to;
			to = temp;
		}
		for (int i = from; i <= to; i++) {
			result += i;
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	

}
