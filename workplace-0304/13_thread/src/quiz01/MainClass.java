package quiz01;

/*
 * 슈퍼 : Weapon
 * 서브 : Gun
 */

public class MainClass {

	public static void main(String[] args) {
		Thread gun1 = new Thread(new Gun("베레타", 10));
		Thread gun2 = new Thread(new Gun("콜트", 10));

		gun1.start();
		gun2.start();

		// 실행 예시
		// 콜트 1발 쐈다
		// 콜트 2발 쐈다
		// 베레타 1발 쐈다
		// ...
	}

}
