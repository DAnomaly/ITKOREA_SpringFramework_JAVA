package ex09_hash;

/*
 * 몇몇 아이디가 있습니다.
 * 각각의 해시코드를 몇몇 규칙으로 생성해 봅니다.
 * 1) 첫 글자에 따라서 해시코드를 정한다
 * 아이디	해시코드
 * 'apple'	1
 * 'africa'	1
 * 'avatar'	1
 * 'banana'	2
 * 'bonus'	2
 * 'bravo'	2
 * 
 * 2) 글자수에 따라서 해시코드를 정한다
 * 아이디	해시코드
 * 'apple'	5
 * 'africa'	6
 * 'avatar'	6
 * 'banana'	6
 * 'bonus'	5
 * 'bravo'	5
 * 
 * 검색된 아이디를 검색하고자 합니다
 * 검색 속도를 높이기 위해서 'hash' 개념이 사용됩니다
 * 
 * 검색 예시)
 * 검색 아이디: 'april'
 * 사용 해시코드 : 글자수
 * 동작
 * 1) 'april'의 해시코드를 구한다.
 * 	  ('april'의 해시코드는 5)
 * 2) 해시코드가 5인 'apple', 'bonus', 'bravo' 중에서 'april'을 찾는다.
 * 
 * 
 */

public class HashCodeMainClass {

	public static void main(String[] args) {

		Integer a = 10;
		System.out.println("a.hashCode():" + a.hashCode());

		Double b = 1.5;
		System.out.println("b.hashCode():" + b.hashCode());

		String str = "hello";
		System.out.println("str.hashCode():" + str.hashCode());

		// 지금까지 살펴 본 바에 따르면
		// 내장된 클래스타입의 객체들은 나름의 해시코드가 있습니다
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog);
		System.out.printf("%x\n",dog.hashCode()); // Object의 해시코드
		
		System.out.println(cat);
		System.out.printf("%x\n",cat.hashCode()); // Object의 해시코드
		
		// 중요
		// Object의 hashCode()는 객체의 메모리 주소를 반환한다.
		
		// HashSet과 HashMap의 공통점은
		// "중복이 불가능한 데이터"가 있다는 점입니다.
		
		// 중복 확인 유무
		// 1. 해시코드(hashCode()) 확인합니다. 해시코드가 같아야 다음 단계로 진행합니다.
		// 2. 실제로 같은지 equals() 메소드로 비교합니다.
		// 3. 그 결과가 같으면 "중복 데이터"가 있는 것으로 판단합니다.
		
	}
	
}

class Dog {}
class Cat {}

