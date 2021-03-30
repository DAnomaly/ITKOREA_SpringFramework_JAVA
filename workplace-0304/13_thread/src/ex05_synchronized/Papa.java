package ex05_synchronized;

public class Papa extends Thread {

	// field
	private Dyson dyson;

	// method
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			dyson.otherCleaning(); // 아빠는 집안 청소 당담
		}
		System.out.println("청소 끝!");
	}

	public Dyson getDyson() {
		return dyson;
	}

	public void setDyson(Dyson dyson) {
		this.dyson = dyson;
	}

}
