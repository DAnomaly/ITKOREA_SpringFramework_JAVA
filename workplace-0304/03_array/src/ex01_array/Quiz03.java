package ex01_array;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 3. 성적 관리 프로그램
		// 학생들의 점수를 입력 받아서, 
		// 평균, 최대, 최소 점수를 출력하기
		
		Scanner sc = new Scanner(System.in);
		String[] students = {"타요", "브레드", "스폰지밥","고양이","강이"};
		int[] scores = new int[students.length];
		
		// 점수 입력
		for (int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "의 점수 >> ");
			scores[i] = sc.nextInt();
		}
		sc.close();
		
		// 평균
		double ave = 0;
		for (int i : scores) {
			ave += i;
		}
		ave /= scores.length;
		System.out.println("평균 : " + Math.round(ave*10)/10d );
		
		// 최대
		int max_score = scores[0];
		String max_score_student = students[0];
		for (int i = 1; i < scores.length; i++) {
			if (max_score < scores[i]) {
				max_score = scores[i];
				max_score_student = students[i];
			}
		}
		System.out.println(String.format("최대 점수 : %d / %s",max_score, max_score_student));
		
		// 최소
		int min_score = scores[0];
		String min_score_student = students[0];
		for (int i = 1; i < scores.length; i++) {
			if(min_score > scores[i]) {
				min_score = scores[i];
				min_score_student = students[i];
			}
		}
		System.out.println(String.format("최소 점수 : %d / %s",min_score, min_score_student));
		
		
		
	}
}
