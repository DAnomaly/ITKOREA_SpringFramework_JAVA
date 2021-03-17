package ex04_constructor;

// 슈퍼클래스
public class Person {

	// field
	private String name;
	
	// Constructor
	protected Person(String name) {
		this.name = name;
	}
	
	// method
	protected void setName(String name) {
		this.name = name;
	} 
	
	protected String getName() {
		return name;
	}
	
}
