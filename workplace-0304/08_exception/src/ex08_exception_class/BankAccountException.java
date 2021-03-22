package ex08_exception_class;

@SuppressWarnings("serial")
public class BankAccountException extends Exception {

	// field
	private int errorCode;
	
	// constructor
	public BankAccountException(String msg, int errorCode) {
		super(msg); // Exception클래스로 message를 전달하면 예외메시지로 생성됩니다.
		this.errorCode = errorCode;
	}
	
	// method
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	
}
