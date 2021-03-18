package quiz03;

public class MainClass {

	public static void main(String[] args) {

		SaleryMan staff1 = new SaleryMan("james", 300);

		SalesMan staff2 = new SalesMan("Jone", 400);
		staff2.setSalesAmount(100);

		Alba staff3 = new Alba("david", 6, 20);
		staff3.setPay(5, 18);

		// 회사
		Company company = new Company(10);
		company.hireStaff(staff1);
		company.hireStaff(staff2);
		company.hireStaff(staff3);
		company.staffInfo();

	}
}
