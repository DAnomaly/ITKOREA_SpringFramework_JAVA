package ex03_has_a;
// has -a 관계로 상속으로 처리할 수 있습니다.
// Cirele has a cored 원하는 점을 가지고 한다포함한다.
// Cirele클래스를 서브클래스로 지정합니다.

public class MainClass {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setCiirle(5, 5, 8);
		
		circle.circleInfo();
		
	}
}
