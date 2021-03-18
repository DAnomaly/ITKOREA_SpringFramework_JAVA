package ex07_override;

public class GogumaPizza extends Pizza {

	// field
	private String goguma;

	// constructor
	public GogumaPizza(String dough, int souce, int cheese, String goguma) {
		super(dough, souce, cheese);
		this.goguma = goguma;
	}

	// method
	// 고구마 정보의 출력을 위해서 Pizza의 info()를 다시 만들어야 합니다.
	@Override
	public void info() {
		super.info();
		System.out.println("goguma: " + goguma);
	}

}
