package ex12_abstract;

public class Circle extends Shape {

	// field
	private double radius;
	
	// constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// method(@Override)
	@Override
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	// getter/setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
