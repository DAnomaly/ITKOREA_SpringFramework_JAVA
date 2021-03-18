package ex10_downcasting;

public class MainClass {

	
	
	public static void main(String[] args) {
		
		// 컴파일 -> 실행
		// 코드 -> new 
		
		Person p1; 
		p1 = new Student();
		p1.eat();
		p1.sleep();
		// p1.study(); // Person p1; 만 보고 호출할 메소드를 결정하기 때문에 불가능합니다.
		
		// Person타입의 p1을 Student타입으로 변경하면 해결됩니다.
		// 1. (Student)p1 : p1을 Student로 캐스팅합니다. (downcasting)
		// 2. (Student)p1.study() :정상작동하지 않습니다.
		//    연산자 최우선 순위 : 마침표(.)
		// 3. ((Student)p1).study() : 캐스팅을 먼저 처리하고나면 study()가 호출됩니다.
		((Student)p1).study();
		
		// ex) Worker
		Person p2;
		p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();

		Person p3;
		p3 = new Student();
		/*
		// 실수를 해 봅시다.
		p3.eat();
		p3.sleep();
		((Worker)p3).work(); // ClassCastException 발생
		*/
		
		// 타입을 확인한 뒤 캐스팅 할 수 있습니다.
		
		// p3가 Student이면 Student로 캐스팅하고,
		// p3가 Worker이면 Worker로 캐스팅하시오.
		System.out.println("------------");
		if (p3 instanceof Student) {
			((Student)p3).study();
		}else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
		
	}
	
}
