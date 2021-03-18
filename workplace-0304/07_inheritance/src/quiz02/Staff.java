package quiz02;

public class Staff { // 직원

	// field
	private String name;

	// constructor
	public Staff(String name) {
		super();
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name;
	}
	
}
