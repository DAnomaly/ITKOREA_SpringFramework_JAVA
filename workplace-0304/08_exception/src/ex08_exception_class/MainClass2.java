package ex08_exception_class;

public class MainClass2 {
	
	// main() 메소드가 던진 예외는 JVM이 처리합니다

	public static void main(String[] args) throws BankAccountException{

		BankAccount me = new BankAccount("1111", 10000);
		BankAccount you = new BankAccount("2222", 10000);
		
		me.deposit(5000);
		me.inquiry();
		
		me.withdraw(8000);
		me.inquiry();
		
		me.transfer(you, 9000);
		me.inquiry();
		
	}
	
}
