package ex09_upcasting;

public class Latte extends Espresso{

	// field
	private int milk;

	// construction
	public Latte(String bean, int water, int milk) {
		super(bean, water);
		this.milk = milk;
	}
	
	// method
	@Override
	public void info() {
		super.info();
		System.out.println("milk: " + milk + "ml");
	}
	
	@Override
	public void taste() {
		System.out.println("Latte is horse!!");
	}
	
}
