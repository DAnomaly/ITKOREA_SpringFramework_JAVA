package quiz03;

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
		}
		System.out.println("getSalaryTotalPay(): " + getSalaryTotalPay());
	}

	// SalaryMan들에게 지급된 급여총액
	public int getSalaryTotalPay() {
		int salaryManTotalpay = 0;
		for (Staff staff : staffList) {
			if (staff instanceof SaleryMan && !(staff instanceof SalesMan)) {
				salaryManTotalpay += ((SaleryMan) staff).getPay();
			}
		} // for
		return salaryManTotalpay;
	}

}
