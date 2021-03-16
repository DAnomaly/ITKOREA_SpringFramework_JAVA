package quiz02;

public class Coord {

	// field
	private int x;
	private int y;
	
	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String strInfo() {
		return String.format("[%d,%d]",x,y);
	}
	
	public void info() {
		System.out.println(strInfo());
	}
	
}
