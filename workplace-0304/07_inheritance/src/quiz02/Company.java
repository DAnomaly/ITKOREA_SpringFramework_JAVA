package quiz02;

public class Company {

	// field
	private Staff[] staffList;
	private int idx;

	// constructor
	public Company(int staffCount) {
		staffList = new Staff[staffCount];
	}

	public void hireStaff(Staff staff) {
		if (idx == staffList.length) {
			System.out.println("직원을 모두 고용했습니다");
			return;
		}
		staffList[idx++] = staff;
	}

	public void staffInfo() {
		for (Staff staff : staffList) {
			if (staff != null) {
				System.out.println(staff.toString());
			}
		} // for
	}
	
	
}
