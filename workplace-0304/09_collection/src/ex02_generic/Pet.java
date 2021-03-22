package ex02_generic;

public class Pet {

	// field
	String name;
	int age;

	// constructor
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// override method
	@Override
	public String toString() {
		return String.format("[name: %s, age: %d]",name ,age);
	}
	
}
