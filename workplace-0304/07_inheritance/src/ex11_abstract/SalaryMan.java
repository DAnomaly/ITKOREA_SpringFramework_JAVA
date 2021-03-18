package ex11_abstract;

/*
 * 추상클래스를 상속 받는 서브클래스들은
 * "반드시" 모든 추상메소드를 오버라이드 해야 합니다.
 */

public class SalaryMan extends Staff {

	// field
	private int salary;

	// constructor
	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("salary: " + getPay());
	}

	// getPay()는 필수입니다
	@Override
	public int getPay() {
		return salary;
	}

}
