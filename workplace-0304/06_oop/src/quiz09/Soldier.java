package quiz09;

public class Soldier {
	
	private String name;
	private Gun[] guns;
	private int idx;
	
	public Soldier(String name, int gunCount) {
		this.name = name;
		guns = new Gun[gunCount];
	}
	
	public void addGun(Gun gun) {
		if(idx < guns.length)
			guns[idx++] = gun;
		else
			System.out.println("더 이상 총을 휴대할 수 없습니다");
	}
	
	// shoot
	public void shoot() {
		for (int i = 0; i < guns.length; i++) {
			guns[i].shoot();
		}
	}
	
	public void shoot(int idx) {
		guns[--idx].shoot();
	}
	
	public void shoot(String model) {
		for (int i = 0; i < guns.length; i++) {
			if(guns[i].getModel().equals(model)) {
				guns[i].shoot();
				return;
			}
		}
		System.out.println(model +"을(를) 찾지 못했습니다");
	}
	
	// reload
	public void reload(int bullet) {
		for (int i = 0; i < guns.length; i++) {
			if(guns[i] != null)
				guns[i].reload(bullet);
		}
	}
	
	public void reload(int idx, int bullet) {
		if(guns[idx-1] != null)
			guns[idx-1].reload(bullet);
	}

	public void reload(String model, int bullet) {
		for (int i = 0; i < guns.length; i++) {
			if (guns[i] != null && guns[i].getModel().equals(model)) {
				guns[i].reload(bullet);
				return;
			}
		}
		System.out.println(model + "을(를) 찾지 못했습니다");
	}

	// info
	public void info() {
		System.out.println("이름: " + name);
		for (int i = 0; i < guns.length; i++) {
			guns[i].info();
		}
	}
	
}
