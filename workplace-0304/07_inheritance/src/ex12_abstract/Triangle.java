package ex12_abstract;

public class Triangle extends Shape {
	
	// field
	private int width;
	private int height;

	// constructor
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// method(@Override)
	@Override
	public double getArea() {
		return width * height * 0.5;
	}

	// getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	

}
