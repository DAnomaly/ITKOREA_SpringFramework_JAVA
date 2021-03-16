package quiz06;

public class Bakery {

	//field
	private int breadCount;
	private int breadPrice;
	private int bakeryMoney;
	
	// constructor
	public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
		this.breadCount = breadCount;
		this.breadPrice = breadPrice;
		this.bakeryMoney = bakeryMoney;
	}
	
	// method
	// 1. 판매
	// 1) 결과타입 : BreadAndChange
	// 2) 메소드명 : sell
	// 3) 매개변수 : int money
	public BreadAndChange sell(int money) {
		// 판매빵개수
		int sellBread = money / breadPrice;
		// 잔돈
		int change = money % breadPrice;
		// 고객에게 돌려줄 BreadAndChange 생성
		BreadAndChange bnc = new BreadAndChange(sellBread, change);
		// Bakery의 판매처리
		bakeryMoney += (money - change);
		breadCount -= sellBread;
		// 고객에게 빵과잔돈 전달
		return bnc;
	}
	
	// 2. info
	public void info() {
		System.out.printf("빵%d개, 자본금%d원\n", breadCount, bakeryMoney);
	}
	
}
