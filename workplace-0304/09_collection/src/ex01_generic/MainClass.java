package ex01_generic;

public class MainClass {

	public static void main(String[] args) {

		Box<String> box1 = new Box<String>(); // 구체화가 진행(Box의 모든 T가 String으로 변환된 뒤 실행됩니다.)
		// Box<String> box1 = new Box<>(); 같은 코드입니다.

		box1.setItem("헬로");
		System.out.println(box1.getItem());

		// 주의사항
		// 제네릭 타입의 구체화는 "기본자료형"의 사용이 불가능합니다
		// ex) BOX<int> box2; (X)
		// 제너릭 타입의 구체화는 "참조자료형"만 가능합니다.
		// "기본자료형"이 필요한 경우 해당 wrapper class를 사용합니다.
		Box<Integer> box2 = new Box<Integer>();

		box2.setItem(60);
		System.out.println(box2.getItem());

		Box<Fruit> box3 = new Box<>();

		box3.setItem(new Fruit("grape", 3000));
		System.out.println(box3.getItem());

	}

}
