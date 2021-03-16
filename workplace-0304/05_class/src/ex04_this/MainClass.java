package ex04_this;

public class MainClass {

	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.set("520d", "BMW", 600000);
		myCar.info();
		System.out.println("myCar: " + myCar);

	}

}
