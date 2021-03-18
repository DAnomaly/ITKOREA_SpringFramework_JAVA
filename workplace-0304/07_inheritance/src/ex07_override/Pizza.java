package ex07_override;

public class Pizza {

	// field
	private String dough;
	private int souce;
	private int cheese;

	// constructor
	public Pizza(String dough, int souce, int cheese) {
		super();
		this.dough = dough;
		this.souce = souce;
		this.cheese = cheese;
	}

	// method
	public void info() {
		System.out.println("dough: " + dough);
		System.out.println("souce: " + souce);
		System.out.println("cheese: " + cheese);
	}

}
