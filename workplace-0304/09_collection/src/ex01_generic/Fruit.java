package ex01_generic;

public class Fruit {

	// field
	private String name;
	private int price;
	
	// constructor
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// method
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}

	
	
	
}
