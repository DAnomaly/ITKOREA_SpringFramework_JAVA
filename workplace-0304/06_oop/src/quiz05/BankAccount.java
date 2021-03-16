package quiz05;

public class BankAccount {

	// field
	private String accNo;
	private long balance;
	
	// method
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(long money) {
		if(money < 0) {
			System.out.println("마이너스 입금은 불가능합니다");
		} else {
			balance += money;
		}
	}
	
	// 실제 출금된 금액을 반환하는 메소드
	public long withdraw(long money) {
		if(balance < money) {
			System.out.println("잔고 부족으로 불가능합니다");
			return 0;
		}else if(money < 0) {
			System.out.println("마이너스 출금은 불가능합니다");
			return 0;
		}else {
			balance -= money;
			return money;
		}
	}
	
	public void inquiry() {
		System.out.printf("계좌번호: %s, 잔액: %d원\n", accNo, balance);
	}
	
	public void transfer(BankAccount bankAccount, int money) {
		/*
		withdraw(money);
		bankAccount.deposit(money);
		*/
		bankAccount.deposit(withdraw(money));
	}
	
	
}
