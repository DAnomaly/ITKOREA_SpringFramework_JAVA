package ex09_upcasting;

public class Coffee {
	
	// field
	private String bean;

	// constructor
	public Coffee(String bean) {
		this.bean = bean;
	}
	
	public void info() {
		System.out.println("bean: " + bean);
	}
	
	public void taste() {
		System.out.println("원두 맛 없다.");
	}
	
}
