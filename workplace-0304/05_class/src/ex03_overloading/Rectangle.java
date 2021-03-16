package ex03_overloading;

/*
 * 오버로딩(over loading)
 * 1. 이름이 같고, 매개변수가 다른 메소드가 있음을 의미합니다
 * 2. 결과타입 오버로딩과 상관이 없습니다
 */



public class Rectangle {
	
	// field
	int weight;
	int height;
	
	//method
	void set (int length) {
		weight = length;
		height = length;
	}
	
	void set (int weight, int height) {
		if(weight > 0)
			this.weight = weight;
		if(height > 0)
			this.height = height;
	}
	
	int getArea() {
		return weight * height;
	}
	
	
	

}
