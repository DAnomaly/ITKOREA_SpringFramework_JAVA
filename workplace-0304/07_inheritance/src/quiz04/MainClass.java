package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Fighter fighter1 = new KoreanFighter("정찬성"); // 에너지 공력력은 렌덤생성
		Fighter fighter2 = new GlobalFighter("에드가");
		
		// 선빵 결정
		boolean myTurn = Math.random() < 0.5;
		do {
			if(myTurn) {
				fighter1.attack(fighter2);
			}else {
				fighter2.attack(fighter1);
			}
			myTurn = !myTurn;
		}while(fighter1.isAlive() && fighter2.isAlive());
		
		
		
	}
	
}
