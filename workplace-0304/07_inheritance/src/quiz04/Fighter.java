package quiz04;

public abstract class Fighter {

	// field
	private String name;
	private boolean isAlive; // 에너지가 0이면 false
	private int energy; // 에너지 (1 ~ 100)
	private int power; // 공격력 (1 ~ 10)

	// constructor
	public Fighter(String name, int energy, int power) {
		this.name = name;
		this.energy = energy < 1 ? 1 : energy;
		this.power = power < 1 ? 1 : power;
		this.isAlive = true;
	}

	// abstract method
	public abstract void attack(Fighter fighter);

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
