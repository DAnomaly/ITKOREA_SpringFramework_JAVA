package ex15_interface_extends;

public class MainClass {
	
	public static void main(String[] args) {

		// 1. Phone타입의 smartPhone
		Phone phone1 = new SmartPhone();
		phone1.sendCall();
		((Computable)phone1).playApp();
		// 2. Computable타입의 smartPhone
		Computable phone2 = new SmartPhone();
		((Phone)phone2).sendCall();
		phone2.playApp();
		// 3. SmartPhone타입의 smartphone
		SmartPhone phone3 = new SmartPhone();
		phone3.sendCall();
		phone3.playApp();
	}
	
}
