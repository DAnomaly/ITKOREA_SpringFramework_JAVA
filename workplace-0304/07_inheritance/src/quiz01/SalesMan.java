package quiz01;

public class SalesMan extends SaleryMan {

	// field
	private int salesAmount; // 판매실적
	private double incentive; // 인센티브(%)

	// constructor
	public SalesMan(String name, int salary) {
		super(name, salary);
	}

	// method
	// getter/setter
	public int getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if (salesAmount >= 1000)
			setIncentive(0.07);
		else
			setIncentive(0.05);
	}

	public double getIncentive() {
		return incentive;
	}

	private void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return super.getPay() + getSalesPay();
	}

	public int getSalesPay() {
		return (int) (salesAmount * incentive);
	}

	@Override
	public String toString() {
		return "SalesMan [salary=" + getPay() + ", name=" + getName() + ", getSalesPay()=" + getSalesPay() + "]";
	}

}
