package ex16_interface_extends;

public class Pet {

	// field
	private String name;

	// constructor
	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(String food) {
		System.out.println(name + "is eating " + food);
	}
	
	
	
}
