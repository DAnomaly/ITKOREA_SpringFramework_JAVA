package ex15_interface_extends;

public class SmartPhone extends Phone implements Computable {

	// Computable의 palyApp()을 반드시 오버라이드 해야한다.
	@Override
	public void playApp() {
		System.out.println("앱을 실행한다");
	}
	
}
