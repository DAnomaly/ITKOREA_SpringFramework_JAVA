package ex07_exception_class;

public class BankAccount {

	// field
	private String accNo;
	private long balance;
	
	// method
	public BankAccount(String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(long money) throws DepositException {
		if(money < 0) {
			throw new DepositException("마이너스 입금은 불가능합니다");
		} else {
			balance += money;
		}
	}
	
	// 실제 출금된 금액을 반환하는 메소드
	public long withdraw(long money) throws WithdrawException{
		if(balance < money) {
			throw new WithdrawException("잔고 부족으로 불가능합니다", 2000);
		}else if(money < 0) {
			throw new WithdrawException("마이너스 출금은 불가능합니다", 2001);
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
		try {
			bankAccount.deposit(withdraw(money));
		}catch (DepositException e) {
			System.out.println(e.getMessage());
		}catch (WithdrawException e) {
			System.out.println(e.getMessage() + "|ERROR:" + e.getErrorCode() );
		}
	}
	
	
}
