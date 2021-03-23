package quiz02;

import java.util.ArrayList;
import java.util.List;

// 1~10000 사이의 값을 가직 있는 ArrayList를 2개 만들고,
// 모든 요소를 하나씩 삭제합니다.
// 1. 가장 성능이 나쁜 방법
// 2. 가장 성능이 좋은 방법

public class MainClass {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		long start, end;

		for (int i = 1; i <= 10000; i++) {
			list1.add(i);
			list2.add(i);
			list3.add(i);
		}

		// 가장 성능이 나쁜 방법
		start = System.nanoTime();
		while (list1.size() != 0)
			list1.remove(0);
		end = System.nanoTime();

		long result1 = end - start;

		// 가장 성능이 좋은 방법
		start = System.nanoTime();
		for (int i = list2.size() - 1; i >= 0; i--) 
			list2.remove(i);
		end = System.nanoTime();

		long result2 = end - start;

		// 그냥 다지움
		start = System.nanoTime();
		list3.clear();
		end = System.nanoTime();

		long result3 = end - start;

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		System.out.println("result3:" + result3);

	}

}
