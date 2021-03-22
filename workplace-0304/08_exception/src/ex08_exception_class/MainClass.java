package ex08_exception_class;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount me = new BankAccount("1111", 10000);
		
		// 입금
		try {
			me.deposit(5000);
		} catch (BankAccountException e) {
			System.out.println("ERRORCODE:" + e.getErrorCode());
			System.out.println(e.getMessage());
		} finally {
			me.inquiry();
		}
		
		
		// 출금
		try {
			me.withdraw(8000);
		} catch (BankAccountException e) {
			System.out.println("ERRORCODE:" + e.getErrorCode());
			System.out.println(e.getMessage());
		} finally {
			me.inquiry();
		}
		
		
		BankAccount you = new BankAccount("2222", 10000);
		
		// 송금
		try {
			you.transfer(me, 8000);
		} catch (BankAccountException e) {
			System.out.println("ERRORCODE:" + e.getErrorCode());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("=================");
			System.out.println(you.getAccNo() + ":");
			you.inquiry();
			System.out.println("-----------------");
			System.out.println(me.getAccNo() + ":");
			me.inquiry();
			System.out.println("=================");
		}
		
		
	}
	
}
