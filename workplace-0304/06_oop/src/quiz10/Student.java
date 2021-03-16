package quiz10;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Student {

	// field
	private String name;
	private int[] scores;	// 점수들
	private double average;	// 평균
	private char grade;		// 학점(A~F)
	private boolean isPass;	// 합격유무(평균 60이상 "합격")
	
	// constructor
	public Student(String name) {
		this.name = name;
	}

	// method
	// getter
	public String getName() {
		return name;
	}

	public int[] getScores() {
		return scores;
	}

	public double getAverage() {
		return average;
	}

	public char getGrade() {
		return grade;
	}

	public boolean isPass() {
		return isPass;
	}
	
	// setter
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void setScores(int scoreCount) {
		// scoreCount만큼 임의의 정수를 scores 배열에 저장
		// 30% 확률 : 0 ~ 49 임의로 생성
		// 40% 확률 : 50 ~ 79 임의로 생성
		// 40% 확률 : 80 ~ 100 임의로 생성
		int[] scores = new int[scoreCount];
		for (int i = 0; i < scores.length; i++) {
			if(Math.random() < 0.3)
				scores[i] = (int)(Math.random()*50);
			else if(Math.random()<0.7)
				scores[i] = (int)(Math.random()*30)+50;
			else
				scores[i] = (int)(Math.random()*21)+80;
		}
		setScores(scores);
		
		// 평균 구하기
		int total = 0;
		for (int score : scores) {
			total += score;
		}
		double average = (double)total/scores.length;
		setAverage(average);
		
		// 학점 구하기 && 합격유무
		setPass(true);
		if(average >= 90) setGrade('A');
		else if(average >= 80) setGrade('B');
		else if(average >= 70) setGrade('C');
		else if(average >= 60) setGrade('D');
		else { setGrade('F'); setPass(false);} 

	}
	
	public void setName(String name) {
		this.name = name;
	}	

	private void setAverage(double average) {
		this.average = average;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	private void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	public void info() {
		System.out.println("이름: " + name);
		System.out.println("점수: " + Arrays.toString(scores));
		System.out.println("평균: " + new DecimalFormat(".00").format(average) + "점");
		System.out.println("학점: " + grade);
		System.out.println("합격유무: " + (isPass ? "합격" : "불합격"));
	}
	
	
}
