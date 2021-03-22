package ex01_generic;

// 제네릭 (generic)
// 일반화된 타입을 이용해서 클래스 또는 메소드를 정의해 두고, 
// 객체 생성이나 메소드 호출할 때
// 구체적으로 타입을 지정하는 방법입니다

public class Box<T> { // Box생성시 Box<String>, Box<Product> 등으로 사용됩니다.
	
	// field
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
