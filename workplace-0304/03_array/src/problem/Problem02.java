package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정렬할 숫자의 갯수
		System.out.print("정렬할 숫자의 갯수 >>> ");
		int cnt = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();

		// 숫자 입력
		System.out.println();
		System.out.println("----- NUMBERS -----");
		for (int i = 0; i < cnt; i++) {
			System.out.print(i + 1 + "번째 숫자 입력 >> ");
			arr.add(sc.nextInt());
		}
		
		sc.close();

		// 입력된 숫자들 출력
		System.out.println();
		System.out.println("----- CHECK -----");
		System.out.println(arr.toString());

		// 숫자들을 정렬
		System.out.println();
		System.out.println("----- RESULT01 -----");
		Collections.sort(arr);
		System.out.println(arr.toString());
		
		// 역순으로 정렬
		System.out.println();
		System.out.println("----- RESULT02 -----");
		Collections.reverse(arr);
		System.out.println(arr.toString());
	}
}
