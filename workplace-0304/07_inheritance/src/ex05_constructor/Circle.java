package ex05_constructor;

public class Circle extends Coord{

	// field
	private int radius;
	
	// constructor
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// method
	public void info() {
		System.out.printf("중심: [%d,%d]\n",getX(),getY());
		System.out.println("반지름: " + radius);
	}
	
	
}
