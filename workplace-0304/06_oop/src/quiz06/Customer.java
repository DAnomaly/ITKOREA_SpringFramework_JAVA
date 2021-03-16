package quiz06;

public class Customer {
	
	// feild
	private int customerBread;
	private int customerMoney;
	
	// constructor
	public Customer(int customerMoney) {
		this.customerMoney = customerMoney;
	}
	
	// method
	// buy
	public void buy(Bakery bakery, int money) {
		// bakery에서 판매한 빵과잔돈을 받으면 됩니다.
		BreadAndChange bnc = bakery.sell(money);
		// 구매처리
		customerBread += bnc.getBread();
		customerMoney -= money - bnc.getChange();
		
		info();
	}
	
	// info
	public void info() {
		System.out.printf("빵 %d개, 남은돈 %d원\n", customerBread, customerMoney);
	}
	
	
	
}
