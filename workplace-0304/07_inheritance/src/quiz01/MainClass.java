package quiz01;

public class MainClass {

	public static void main(String[] args) {

		SaleryMan staff1 = new SaleryMan("james", 300);
		System.out.println(staff1.toString());

		SalesMan staff2 = new SalesMan("Jone", 400);
		staff2.setSalesAmount(100);
		System.out.println(staff2.toString());

		Alba staff3 = new Alba("david", 6, 20);
		System.out.println(staff3.toString());

		System.out.println("<" + staff3.getName() + " 재계약>");
		staff3.setPay(5, 18);
		System.out.println(staff3.toString());

	}
}
