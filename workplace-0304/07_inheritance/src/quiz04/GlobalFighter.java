package quiz04;

public class GlobalFighter extends Fighter {

	// constructor
	public GlobalFighter(String name) {
		super(name, (int)(Math.random() * 100 + 1) ,(int)(Math.random() * 10 + 1));
	}

	// method
	// attack() : 10% 확률로 한 방에 KO 시킬 수 있습니다.
	@Override
	public void attack(Fighter fighter) {
		System.out.println(">> " + getName() + "의 차례");
		boolean skill = Math.random() <= 0.1;
		if (skill) {
			System.out.println("<<스킬발동!!>>");
			fighter.setEnergy(0);
			return;
		}
		System.out.printf("%s에게 %d의 데미지! >> %s의 체력 : %d\n",fighter.getName(),getPower(),fighter.getName(),fighter.getEnergy()-getPower());
		fighter.setEnergy(fighter.getEnergy()-getPower());
	}

}
