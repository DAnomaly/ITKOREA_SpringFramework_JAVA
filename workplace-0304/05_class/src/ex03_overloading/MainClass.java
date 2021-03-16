package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {

		// 직사각형을 만들어 봅니다.
		Rectangle nemo1 = new Rectangle();
		nemo1.set(3, 4); // 너비3, 높이4
		System.out.println("nemo1 넓이 : " + nemo1.getArea());
		
		// 정사각형을 만들어 봅니다.
		Rectangle nemo2 = new Rectangle();
		nemo2.set(3); // 너비3, 높이3
		System.out.println("nemo2 넓이 : " + nemo2.getArea());
		
	}
	
}
