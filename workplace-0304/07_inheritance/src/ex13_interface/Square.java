package ex13_interface;

public class Square extends Rectangle{
	
	// constructor
	public Square(int width) {
		super(width, width);
	}
	
	// method(@Override)
	@Override
	public double getArea() {
		return super.getArea();
	}

	@Override
	public int getWidth() {
		return super.getWidth();
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public int getHeight() {
		return super.getHeight();
	}

	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}

	
}
