package ex05_constructor;

public class Coord {
	// field
	private int x,y;
	
	// constructor
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// method
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
