package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		Soldier soldier = new Soldier("람보",3); // 람보는 총을 최대 3개 가질수 있다.
		
		soldier.addGun(new Gun("콜트리볼버", 6 ));
		soldier.addGun(new Gun("베레타", 6 ));
		soldier.addGun(new Gun("M9", 6 ));
		
		soldier.shoot(); // 모든 총을 한 발씩 쏜다.
		soldier.shoot(1); // 콜트리볼버를 한발 쏜다.
		soldier.shoot("베레타"); // 베레타를 한 발 쏜다.
		
		soldier.info();
		// 이름: 람보
		// 콜트리볼버(4발)
		// 베레타(5)
		// M9(5)
		
		soldier.reload(6); // 모든 총에 6발을 추가한다.
		soldier.reload(1,6); // 콜트리볼버에 6발을 추가한다.
		soldier.reload("베레타",6); // 베레타에 6발을 추가한다
		
	}
	
}
