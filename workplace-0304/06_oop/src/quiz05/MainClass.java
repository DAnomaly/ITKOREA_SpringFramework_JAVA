package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("9999", 10000);
		
		// 이체
		me.transfer(you, 5000); // 5000원 이체
		me.transfer(you, -100); // 마이너스 입금은 불가능합니다
		me.transfer(you, 7000); // 잔고 부족으로 불가능합니다
		
		/*
		// 입금
		me.deposit(10000); // 10000원 입금
		me.deposit(-1000); // 마이너스 입금은 불가능합니다
		
		// 출금
		you.withdraw(5000); // 5000원 출금
		you.withdraw(-100); // 마이너스 출금은 불가능합니다
		you.withdraw(7000); // 잔고 부족으로 불가능합니다
		 */
		
		// 조회
		me.inquiry(); 
		you.inquiry();
		
	}
	
}
