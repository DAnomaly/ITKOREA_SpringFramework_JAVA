package ex17_Object.ex03;

public class MainClass {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		// lombok으로 추가한 setter
		dog.setAge(3);
		dog.setName("Angusa");
		// lombok으로 추가한 getter
		System.out.println("dog.getName(): " + dog.getName());
		System.out.println("dog.getAge(): " + dog.getAge());
		// lombok으로 추가한 toString
		System.out.println(dog);
		
	}
	
}
