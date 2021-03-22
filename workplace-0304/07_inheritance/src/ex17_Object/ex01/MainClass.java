package ex17_Object.ex01;

// Object 클래스

// 1. 모든 클래스들의 최상위 슈퍼클래스입니다.
// 2. extends 처리는 하지 않습니다.
// 3. 모든 데이터는 Object 타입으로 저장할 수 있습니다.

public class MainClass {

	public static void main(String[] args) {

		Object obj1 = new Dog();
		Object obj2 = 1.5;
		Object obj3 = 1;

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		// Ojbect에 저장된 객체는
		// 캐스팅 한 뒤 사용합니다.
		((Dog) obj1).move();
		
		

	}

}
