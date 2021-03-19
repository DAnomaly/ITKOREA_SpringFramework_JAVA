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
		this.isAlive = true;
		this.energy = energy;
		this.power = power;
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
		if(!isAlive)
			System.out.println(getName() + "은(는) 쓰러졌다!");
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
		if(energy <= 0)
			setAlive(false);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void info() {
		System.out.printf("%4s energy : %3d, power : %3d\n",getName(), getEnergy(), getPower() );
	}

}
