package quiz01;

public class SaleryMan extends Staff { // 정규직

	// field
	private int salary;

	// constructor
	public SaleryMan(String name, int salary) {
		super(name); // 슈퍼클래스 Staff의 생성자를 호출
		this.salary = salary;
	}

	// method
	public int getPay() {
		return salary;
	}

	@Override
	public String toString() {
		return "SaleryMan [salary=" + salary + ", name=" + getName() + "]";
	}

}
