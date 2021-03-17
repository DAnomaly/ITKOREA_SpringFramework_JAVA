package ex06_override;

public class Coffee {

	// field
	private String bean; // 원두
	
	// constructor
	public Coffee(String bean) {
		this.bean = bean;
	}
	
	// method
	public void taste() {
		System.out.println(bean + " 원두는 맛이 없습니다");
	}
	
}
