package ex09_upcasting;

public class Espresso extends Coffee {

	// field
	private int water;

	// constructor
	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}
	
	// method
	@Override
	public void info() {
		super.info(); // Coffee의 info()
		System.out.println("water: " + water + "ml");
	}
	
	@Override
	public void taste() {
		System.out.println("에스프레소 맛이 진하다.");
	}
	
	
}
