package quiz07;

import java.util.Scanner;

public class Player {

	// field
	private String name;
	private Scanner sc = new Scanner(System.in);
	
	
	// constructor
	public Player(String name) {
		this.name = name;
	}
	
	// method
	// 이름확인 (getter)
	public String getName() {
		return name;
	}
	
	public int play() {
		System.out.println(name + "'s game start!");
		System.out.println("Press Enter");
		// Enter입력 : nextLine()
		sc.nextLine();
		long start = System.currentTimeMillis();
		System.out.println("After 10seconds Press Enter!");
		sc.nextLine();
		long end = System.currentTimeMillis();
		return (int)((end - start) /1000);
	}
	
	
	
}
