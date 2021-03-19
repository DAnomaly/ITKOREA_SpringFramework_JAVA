package ex13_interface;

// 인터페이스는 본문이 없는 추상메소드를 가지고 있으므로,
// 해당 추상메소드를 반드시 오버라이드를 해야 합니다

// 클래스를 상속 받을 때는 extends를 사용하고,
// 인터페이스를 구현할 때는 implements를 사용합니다.

// 클래스를 상속받는다. ===== 인터페이스를 구현한다.
 
public class Rectangle implements Shape { // extends <-> implements

	// field
	private int width;
	private int height;
	
	// constructor
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	// method(@Override)
	@Override
	public double getArea() {
		return width * height;
	}

	// getter / setter
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
