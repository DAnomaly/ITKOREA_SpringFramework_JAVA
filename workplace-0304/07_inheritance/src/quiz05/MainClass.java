package quiz05;

public class MainClass {

	public static void main(String[] args) {
		
		Bunker bunker = new Bunker();
		bunker.add(new Marrine());
		bunker.add(new Firebat());
		// bunker.add(new Tank());
		
		bunker.info();
	}
	
}
