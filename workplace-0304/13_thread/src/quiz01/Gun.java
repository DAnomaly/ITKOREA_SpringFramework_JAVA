package quiz01;

public class Gun extends Weapon implements Runnable {

	private int bullet;

	public Gun(String name, int bullet) {
		super(name);
		this.bullet = bullet;
	}

	@Override
	public void run() {
		int i = 1;
		while (bullet > 0) {
			shoot(i);
			i++;
		}
	}

	public void shoot(int i) {
		if (bullet < 0) {
			System.out.println("헛빵");
			return;
		}
		bullet--;
		System.out.println(name + " " + i + "발 쐈다.");
	}

}
