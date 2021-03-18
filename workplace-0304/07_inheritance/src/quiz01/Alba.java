package quiz01;

public class Alba extends Staff {

	// field
	private int payPerHour;
	private int times;

	// constructor
	public Alba(String name, int times, int payPerHour) {
		super(name);
		this.times = times;
		this.payPerHour = payPerHour;
	}

	// method
	public int getPayPerHour() {
		return payPerHour;
	}

	public int getTimes() {
		return times;
	}

	public void setPay(int times, int payPerHour) {
		this.payPerHour = payPerHour;
		this.times = times;
	}

	public int getpay() {
		return payPerHour * times;
	}

	@Override
	public String toString() {
		return "Alba [salary=" + getpay() + ", name=" + getName() + "]";
	}

}
