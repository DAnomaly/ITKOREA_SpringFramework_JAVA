package ex05_constructor;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("alice", 30, '여'); // 생성자 (constructor 호출)
		
		System.out.println("p.name : " + p.name);
		System.out.println("p.age : " + p.age);
		System.out.println("p.gender : " + p.gender);
	}
	
}
