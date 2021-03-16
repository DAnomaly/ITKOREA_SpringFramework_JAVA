package ex02_2d_array;

import java.util.Scanner;

/*
 * 4. 성적 관리 프로그램
 * 학생별 총점과 과목별 총점을 구해서 출력하기
 * 
 * --- SCANNER ---
 * OO의 국어 점수 >>> 10
 * OO의 영어 점수 >>> 10
 * OO의 수학 점수 >>>
 * ...
 * 
 * --- RESULT ---
 * 			국어	영어	수학	학생합계
 * 	1O		00	00	00	00
 * 	2O		00	00	00	00
 * 	3O		00	00	00	00	
 * 	과목합계	00	00	00	00	
 * 
 */

public class Quiz04 {

	public static void main(String[] args) {

		String[] names;
		String[] subjects = { "국어", "영어", "수학", "학생합계" };

		System.out.println("----- SCANNER -----"); // Scanner 클래스 준비
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("----- STUDENTS -----"); // 학생수 , 학생이름 입력
		System.out.print("학생수 입력 >>> ");
		names = new String[sc.nextInt() + 1];
		for (int i = 0; i < names.length - 1; i++) {
			System.out.print(i + 1 + "번째 학생 이름 >>> ");
			names[i] = sc.next();
		}
		names[names.length - 1] = "점수합계";

		System.out.println();
		System.out.println("----- SCORES -----"); // 점수 입력
		int[][] scores = new int[names.length][subjects.length];
		for (int i = 0; i < names.length - 1; i++) {
			for (int j = 0; j < subjects.length - 1; j++) {
				System.out.print(String.format("%s의 %s 점수 >>> ", names[i], subjects[j]));
				scores[i][j] = sc.nextInt();
				scores[i][subjects.length - 1] += scores[i][j];
				scores[names.length - 1][j] += scores[i][j];
				scores[names.length - 1][subjects.length - 1] += scores[i][j];
			}
		}
		sc.close();

		System.out.println();
		System.out.println("----- RESULT -----"); // 점수 표 출력
		System.out.print("\t");
		for (String str : subjects) {
			System.out.print(str + "\t");
		}
		System.out.println();
		int i = 0;
		for (int[] is : scores) {
			System.out.print(names[i++] + "\t");
			for (int score : is) {
				System.out.print(score + "\t");
			}
			System.out.println();
		}

	}

}
