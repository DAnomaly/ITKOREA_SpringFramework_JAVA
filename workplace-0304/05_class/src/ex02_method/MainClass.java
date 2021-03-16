package ex02_method;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person();

		p.set("Nicholas", 22, '여', false, 135.2 , 36.5);

		p.info();

		System.out.println();
		System.out.println("p.getBMI() : " + p.getBMI());
		
	}

}
