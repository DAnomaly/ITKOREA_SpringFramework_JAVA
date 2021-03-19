package ex13_interface;

public class MainClass {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[10];
		shapes[0] = new Rectangle(3, 4);
		shapes[1] = new Square(5);
		shapes[2] = new Triangle(3,5);
		shapes[3] = new Circle(1.5);
		
		for(Shape shape : shapes) {
			if(shape != null)
				System.out.println(shape.getArea());
		}
		
		
		
	}
	
}
