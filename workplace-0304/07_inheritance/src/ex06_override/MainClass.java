package ex06_override;

public class MainClass {

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee("콜롬비아");
		coffee.taste();
		
		Espresso espresso = new Espresso("콜롬비아", 30);
		espresso.taste();
	}
	
}
