package ex05_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 	 LinkedList 클래스
 *  1. List 인터페이스를 구현한 클래스입니다
 *  2. 생성방법
 *    1) LinkedList<E> list = new LinkedList<>();
 *    2) List<E> list = new LinkedList<>(); 
 *  3. 연결리스트를 구현한 클래스입니다. 자동으로 길이를 조정합니다
 *  4. 장점 : 모든 위치에 추가/삭제가 빠르다
 *  5. 단점 : 순차적인 접근이 느리다
 * 
 */
public class LinkedListMainClass {

	public static void main(String[] args) {
		
		// ArrayList와 LinkedList의 사용법은 같습니다.
		
		// 성능비교
		List<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> linked = new LinkedList<Integer>();
		
		long start, end;
		
		// 1. 추가 (인덱스 0에 데이터 추가)
		start = System.nanoTime();
		for (int n = 1 ; n <= 10000 ; n ++) {
			arr.add(0, n);
		}
		end = System.nanoTime();
		System.out.println(end - start);
		
		start = System.nanoTime();
		for (int i = 0; i <= 10000; i++) {
			linked.add(0,i);
		}
		end = System.nanoTime();
		System.out.println(end - start);
		
		
		// 2. 순회
		start = System.nanoTime();
		for (Integer integer : arr) {
		}
		end = System.nanoTime();
		System.out.println(end - start);
		
	
		
		start = System.nanoTime();
		for (Integer integer : linked) {
		}
		end = System.nanoTime();
		System.out.println(end - start);
		
			
			
			
		
		
		
		
		
		
	}
	
}
