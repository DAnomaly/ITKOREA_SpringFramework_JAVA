package main;

import java.util.Scanner;

public class AddressManager {

	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.println("===============");
		System.out.println("1. 번호등록");
		System.out.println("2. 번호조회");
		System.out.println("3. 종료");
		System.out.println("===============");
	}

	public void execute() {
		while (true) {
			menu();
			System.out.print("번호 >>");
			while (true) {
				switch (sc.nextInt()) {
				case 1:
					// TODO : insert()
					break;
				case 2:
					// TODO : selectlist()
					break;
				case 3:
					return;
				default:
					System.out.println("잘못된 번호입니다");
					break;
				}
			}
		}
	} // execute()

}
