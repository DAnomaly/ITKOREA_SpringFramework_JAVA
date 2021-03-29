package ex02;

public class Player implements Runnable{

	// field
	private String name;

	// constructor
	public Player(String name) {
		this.name = name;
	}

	//method
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name + "이(가) 게임중입니다");
		}
	}
	
}
