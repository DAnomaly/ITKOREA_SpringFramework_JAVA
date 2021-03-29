package ex02;

public class MainClass {

	public static void main(String[] args) {
		
		// Runnable 인터페이스를 구현한 스레드는
		// 1. 생성
		// 2. Thread로 변경
		// 과정을 거칩니다.
		
		Player p1 = new Player("레이디버그");
		Thread player1 = new Thread(p1);
		
		Player p2 = new Player("레오파드");
		Thread player2 = new Thread(p2);
		
		Player p3 = new Player("헬켓");
		Thread player3 = new Thread(p3);
		
		player1.start();
		player2.start();
		player3.start();
		
	}
	
}
