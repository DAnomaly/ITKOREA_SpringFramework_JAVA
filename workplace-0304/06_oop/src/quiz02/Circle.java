package quiz02;

public class Circle {

	private Coord center;
	private double radius;
	
	public Circle(Coord center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(int x, int y, double radius) {
		// center = new Coord(x,y);
		// this.radius = radius;
		this(new Coord(x,y),radius);
	}
	
	public void info() {
		Double erea = Math.pow(radius,2) * Math.PI;
		
		System.out.printf("중심좌표 %s, 반지름 %.2f, 넓이 %.3f\n"
				,center.strInfo(),radius,erea);
	}
	
}
