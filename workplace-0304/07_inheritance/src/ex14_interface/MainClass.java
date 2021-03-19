package ex14_interface;

public class MainClass {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo(6);
		
		zoo.addAniaml(new Eagle());
		zoo.addAniaml(new Eagle());
		zoo.addAniaml(new Lion());
		zoo.addAniaml(new Shark());
		
		zoo.info();
		
	}
	
}
