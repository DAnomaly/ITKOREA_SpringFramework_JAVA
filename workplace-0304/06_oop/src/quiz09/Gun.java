package quiz09;

public class Gun {

	// field
	private final int FULL_BULLET = 6;
	private String model;
	private int bullet;
	
	// constructor
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
	}

	// method
	public void shoot() {
		if (bullet > 0) {
			bullet--;
			System.out.println(model + " 빵야! (" + bullet + "발 남았다.)");
		} else if (bullet == 0)
		System.out.println(model + " 헛빵!");
	}
	
	public void reload(int bullet) {
		if (this.bullet + bullet <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(model + "(" + bullet + "발 추가되었다. 현재 " + this.bullet + "발)");
		} else {
			int realBullet = FULL_BULLET - this.bullet;
			this.bullet = FULL_BULLET;
			System.out.println(model + "(" + realBullet + "발 추가되었다. 현재 " + this.bullet + "발)");
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void info() {
		System.out.println(model + "(" + bullet + "발)");
	}
	
}
