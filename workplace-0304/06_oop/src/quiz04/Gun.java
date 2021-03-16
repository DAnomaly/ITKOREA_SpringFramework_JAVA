package quiz04;

public class Gun {

	private String model;
	private int bullet;
	private final int FULL_BULLET = 6;
	
	public Gun(String model, int bullet) {
		this.model = model;
		if (bullet > FULL_BULLET)
			this.bullet = FULL_BULLET;
		else
			this.bullet = bullet;
	}
	
	public Gun(String model) {
		this.model = model;
		bullet = FULL_BULLET;
	}
	
	public void shoot() {
		if(bullet <= 0)
			System.out.println("헛빵!");
		else {
			bullet--;
			System.out.println("빵야!" + bullet + "발 남았다.");
		}
	}
	
	public void reload(int bullet) {
		
		if(bullet + this.bullet > FULL_BULLET)
			bullet = FULL_BULLET - this.bullet;

		this.bullet += bullet;
		
		System.out.println(bullet + "발이 장전되었다. 현재 " + this.bullet + "발");
		
	}
	
	public String getModel() {
		return model;
	}
	
	public int getBullet() {
		return bullet;
	}
	
}
