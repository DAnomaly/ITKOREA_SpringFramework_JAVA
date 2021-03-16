package ex06_access;

// 접근제어자(access modifier)
// 1. private   : 클래스 내부에서만 볼 수 있습니다
// 2. default   : 같은 패키지에서만 볼 수 있습니다 access modifier를 지정하지 않는다
// 3. protected : 같은 패키지또는 상속 관계에서만 볼 수 있습니다
// 4. public    : 어디서든 볼 수 있습니다

// 지정하는 방법
// 1. 필드는 private 합니다
// 2. 메소드(생성자, 일반메소드)는 public 합니다

public class Person {
	
	// field
	private String name;
	private int age;
	private boolean isKorean;
	private char gender;
	
	// method
	
	// 1. 필드에 값을 전달하는 메소드 : setter
	// 2. 필드값을 반환하는 메소드 : getter
	
	// name에 접근할 수 있는 메소드
	// 1. name에 값을 전달하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	// 2. name을 반환하는 메소드
	public String getName() {
		return name;
	}
	
	// age에 접근할 수 있는 메소드
	// 1. age에 값을 전달하는 메소드
	public void setAge(int age) {
		this.age = age;
	}
	// 2. age을 반환하는 메소드
	public int getAge() {
		return age;
	}
	
	// isKorean에 접근할 수 있는 메소드
	// 1. isKorean에 값을 전달하는 메소드
	public void setKorean(boolean isKorean) {
		this.isKorean = isKorean;
	}
	// 2. isKorean을 반환하는 메소드
	public boolean isKorean() {
		return isKorean;
	}
	
	// isGender에 접근할 수 있는 메소드
	// 1. isGender에 값을 전달하는 메소드
	public void setGender(char gender) {
		this.gender = gender;
	}
	// 2. isGender을 반환하는 메소드
	public char getGender() {
		return gender;
	}
	
	
	
}
