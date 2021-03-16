package ex02_method;

/*
 *   메소드 (method)
 *   1. 구성
 *     1) 결과타입
 *     2) 메소드명
 *     3) 매개변수
 *   2. 정의
 *      결과타입 메소드명(매개변수)
 */

public class Person {

	// field
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height;
	double weight;

	// method (field를 사용할 수 있는 함수)
	// 1. 결과타입 : 결과값이 없다. (void)
	// 2. 메소드명 : set
	// 3. 매개변수 : String n , int a, char g, boolean isK
	// 4. 역할 : 전달되는 인수를 필드에 전달합니다.
	void set(String n, int a, char g, boolean isK, double h, double w) {
		name = n;
		age = a;
		gender = g;
		isKorean = isK;
		height = h;
		weight = w;
	}

	// 1. 결과타입 : 결과값이 없다. (void)
	// 2. 메소드명 : info
	// 3. 매개변수 : 전달되는 인수가 없다.
	// 4. 역할 : 객체의 필드값을 출력해 줍니다.
	void info() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("isKorean : " + isKorean);
	}
	
	// 1. 결과타입 : 결과값의 타입이 double입니다.
	// 2. 메소드명 : getBMI
	// 3. 매개변수 : 전달되는 인수가 없다.
	// 4. 역할 : 객체의 체질량지수(BMI)값을 결과로 반환합니다.
	double getBMI() {
		// bmi = 몸무게 / 키제곱
		double bmi = weight / Math.pow(height/100,2);
		
		return bmi;
	}

	
}
