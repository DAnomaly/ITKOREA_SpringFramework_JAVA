package quiz02;

public class MainClass {
	public static void main(String[] args) {
		
		Coord center = new Coord(0,0);
		Circle won = new Circle(center, 1.5);
		
		center.info(); // [0,0];
		won.info(); // 중심좌표 [0,0], 반지름 1.5, 넓이 x.xx
		
		Circle won2 = new Circle(1, 1, 1.5);
		won2.info(); // 중심좌표 [1, 1], 반지름 1.5, 넓이 x.xx
		
	}
}
