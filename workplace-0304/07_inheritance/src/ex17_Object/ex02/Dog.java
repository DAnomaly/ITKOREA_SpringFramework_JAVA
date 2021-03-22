package ex17_Object.ex02;

public class Dog {

	// field
	private String name;

	// constructor
	public Dog(String name) {
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}

	// Object클래스의 toString()을 상요하지 않기 위해서
	// toString() 메소드를 오버라이드를 한다
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

}
