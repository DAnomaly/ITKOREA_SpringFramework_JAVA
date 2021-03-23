package ex05_list;

import java.util.ArrayList;
import java.util.List;

/* 	 ArrayList 클래스
 *  1. List 인터페이스를 구현한 클래스입니다.
 *  2. 생성방법
 *    1) ArrayList<E> list = new ArrayList<>();
 *    2) List<E> list = new ArrayList<>(); 
 *  3. 배열을 구현한 클래스입니다. 자동으로 길이를 조정합니다.
 *  4. 장점 : 순차적인 접근이 빠르다.
 *  5. 단점 : 중간 위치에 추가/삭제가 느리다.
 * 
 */

public class ArrayListMainClass {

	public static void main(String[] args) {

		// 1. 생성
		List<String> list = new ArrayList<>();

		// 2. 추가
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		list.add("구름");
		list.add("브레드");

		// 3. 삭제
		list.remove(0);
		list.remove("자두");

		// 4. 크기
		System.out.println("list.size(): " + list.size());

		// 5. 확인
		System.out.println("list.contains(\"브레드\"): " + list.contains("브레드"));

		// 6. 요소 가져오기
		System.out.println("list.get(1): " + list.get(1));
		System.out.println("list.get(list.size() - 1):" + list.get(list.size() - 1));

		// 7. 전체 순회
		// 1) 일반 for문
		System.out.println("===========");
		// size() 메소드 호출을 1번만 진행하도록 변수에 저장해 둡니다
		for (int i = 0, length = list.size(); i < length; i++) {
			System.out.println((i + 1) + "번지:" + list.get(i));
		}

		// 2) 향상 for문
		System.out.println("===========");
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();

		// 8. 출력 (toString)
		System.out.println("===========");
		System.out.println("list: " + list);

		// 9. 초기화
		list.clear();
		System.out.println("==초기화===");
		System.out.println("list: " + list);
	}

}
