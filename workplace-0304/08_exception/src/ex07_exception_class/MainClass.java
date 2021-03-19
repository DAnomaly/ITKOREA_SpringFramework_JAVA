package ex07_exception_class;

public class MainClass {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("0101", 10000);
		BankAccount account2 = new BankAccount("0102", 10000);
		
		account1.transfer(account2, 12000);
		
		account1.inquiry();
		account2.inquiry();
	}
	
}
