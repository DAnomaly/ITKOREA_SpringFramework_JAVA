package quiz04;

public class Soldier {

	// field
	private String name;
	private Gun gun;
	
	public Soldier(String name, Gun gun) {
		this.name = name;
		this.gun = gun;
	}
	
	public void shoot() {
		gun.shoot();
	}
	
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	public void info() {
		System.out.printf("%s, %s에 %d발 남았다", name, gun.getModel(), gun.getBullet());
	}
	
}
