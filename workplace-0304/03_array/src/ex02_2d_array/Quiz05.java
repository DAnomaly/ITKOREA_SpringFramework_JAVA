package ex02_2d_array;

import java.util.Scanner;

// 5. 영한사전
// "영어단어"와 "의미"를 배열에 저장해 두고,
// 묻고 답하는 프로그램
// 봄을 영어로 하면? >>> spring
// 정답
// 여름을 영어로 하면? >>> suuuummer
// 오답
// 가을을 영어로 하면? >>> fall
// 정답
// 겨울을 영어로 하면? >>> winder
// 오답
// 2문제를 맞히고, 2문제를 틀렸습니다

public class Quiz05 {

	public static void main(String[] args) {

		String[][] dict = { { "봄", "spring" }, { "여름", "summer" }, { "가을", "fall" }, { "겨울", "winter" } };
		Scanner sc = new Scanner(System.in);
		System.out.println("----- QUESTION -----");
		int correct = 0;
		int wrong = 0;
		for (String[] strings : dict) {
			System.out.print(String.format("%s을 영어로 하면? >>> ", strings[0]));
			if (strings[1].equalsIgnoreCase(sc.next())) {
				System.out.println("정답");
				correct++;
			} else {
				System.out.println("오답");
				wrong++;
			}
		}
		System.out.println();
		System.out.println("----- RESULT -----");
		System.out.println(String.format("%d문제를 맞히고, %d문제를 틀렸습니다", correct, wrong));

		sc.close();
	}

}
