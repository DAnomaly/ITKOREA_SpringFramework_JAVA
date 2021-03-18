package ex08_upcasting;

public class Tv extends Elec {

	// field
	private String model;

	// constructor
	public Tv(String model, int watt) {
		super(watt);
		this.model = model;
	}

	// method
	@Override
	public void info() {
		System.out.println("[TV model=" + model + "]");
		super.info();
	}
}
