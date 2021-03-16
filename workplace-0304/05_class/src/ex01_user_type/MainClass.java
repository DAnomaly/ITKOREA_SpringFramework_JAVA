package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
	
		// 클래스 Person 타입으로 하는 "객체"를 생성합니다
		/*
		 *  1. 타입 : Person
		 *  2. 객체 : p1
		 */
		
		Person p1 = new Person();
		
		// 클래스에 포함된 맴버(필드, 메소드)는 마침표(.)를 이용해서 호출합니다
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.gender);
		System.out.println(p1.isKorean);
		
		// Person은 reference type입니다
		System.out.println(p1); // new Person()으로 생성된 객체의 주소
		
		Person p2 = p1; // p2는 객체 p1의 "주소(참조)"를 그대로 가지고 있습니다
		System.out.println(p2); 
		
		p2.name = "alice";
		
		System.out.println("p2.name = " + p2.name);
		System.out.println("p1.name = " + p1.name);
		
		
	}
	
}
