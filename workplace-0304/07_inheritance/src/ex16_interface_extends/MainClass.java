package ex16_interface_extends;

public class MainClass {

	public static void main(String[] args) {
		
		Dog dog = new Dog("댕댕이");
		Snake snake = new Snake("뱜");
		
		Person person = new Person();
		
		// 1. food 주기
		person.feed(dog, "닭고기");
		person.feed(snake, "소고기");
		
		// 2. walking
		person.walking(dog);
		// person.walking(snake); // 컴파일 에러를 내고 싶다
		
	}
	
}
