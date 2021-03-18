package ex11_abstract;

/*
 *  > 추상메소드 (abstract method)
 *   1. 본문이 없는 메소드입니다
 *   2. 메소드를 정의할 때 abstract 키워드를 앞에 추가합니다.
 *   3. 중괄호({})를 작성하지 않습니다. 세미콜론(;)을 붙입니다.
 *   
 *  > 추상클래스 (abstract class)
 *   1. 추상메소드가 1개 이상 포함된 클래스입니다.
 *   2. 클래스 정의 앞에 abstract 키워드를 추가합니다.
 */

public abstract class Staff { // abstract public 도 가능합니다.

	// field
	private String name;

	// construction
	public Staff(String name) {
		super();
		this.name = name;
	}

	// method
	public void info() {
		System.out.println("---------------");
		System.out.println("name: " + name);
	}

	/*
	 *  public int getPay(){ return ??; }
	 *  현실적으로 반환할 수 있는 값은 없습니다
	 */
	// 본문이 없는 getPay() 메소드를 만들면 됩니다.
	public abstract int getPay(); // abstract public도 가능합니다.

}
