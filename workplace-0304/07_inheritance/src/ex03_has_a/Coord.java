package ex03_has_a;

public class Coord {

	// field
	private 
	int x, y;
	
	// method
	public void set (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void info() {
		System.out.printf("[x:%d,Y:%d]\n", x, y);
	}
	
}
