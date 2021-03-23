package ex06_set;

import java.util.HashSet;
import java.util.Set;

/*  HashSet 클래스
 *  1. Set 인터페이스를 구현한 클래스입니다.
 *  2. 기본 특징
 *    1) 인덱스가 없습니다. (순서가 없다.)
 *    2) 중복 저장이 불가능합니다.
 *  3. 기본적인 사용법은 List와 같지만, 인덱스가 없음에 주의합니다.
 */


public class HashSetMainClass {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("eclipes");
		set.add("jsp");
		set.add("spring");
		set.add("jsp");
		set.add("java");
		set.add("spring");
		set.add("spring");
		
		System.out.println("set.size():" + set.size());
		
		for (String string : set) {
			System.out.print(string + " ");
		}
		System.out.println();
		

		
		
		
	}
	
}
