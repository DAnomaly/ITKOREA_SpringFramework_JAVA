package ex07_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*  Iterator 인터페이스
 *  1. Collection을 순회하는 경우에 사용합니다
 *  2. "반복자"라고 합니다.
 *  3. 순회를 하고자 하는 Collection에 iterator() 메소드를 부착해서 생성합니다
 *  4. 인덱스 유무와 상관없이 사용합니다
 */

public class IteratorMainClass {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("movie");
		set.add("music");
		set.add("sport");

		// set를 순회할 수 있는 Iterator 객체 생성
		Iterator<String> itr = set.iterator(); // set을 순회할 수 있는 itr 객체 생성

		// hasNext() : 다음 요소가 있으면 true, 없으면 false를 반환
		// next() : 다음 요소를 가져온다.

		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("===============");

		List<String> list = new ArrayList<>();

		list.add("kor");
		list.add("eng");
		list.add("mat");

		// set을 순회할 수 있는 iterator 객체 생성
		Iterator<String> list_itr = list.iterator();

		while (list_itr.hasNext())
			System.out.println(list_itr.next());

	}
}
