package ex07_exception_class;

@SuppressWarnings("serial")
public class WithdrawException extends Exception {

	// field
	private int errorCode;

	// constructor
	public WithdrawException(String msg, int errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
