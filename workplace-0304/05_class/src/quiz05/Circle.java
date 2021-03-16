package quiz05;

public class Circle {

	// field
	double radius; // 반지름
	
	// method
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getCircum() {
		return 2*radius*Math.PI;
	}
	
	double getArea() {
		return Math.pow(radius,2)*Math.PI;
	}
	
}
