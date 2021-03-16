package quiz10;

import java.text.DecimalFormat;

public class Lecture {
	
	String lecturename;
	Student[] students;

	public Lecture(String classname, String[] names) {
		this.lecturename = classname;
		students = new Student[names.length];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(names[i]);
		}
	}
	
	public void exam(int e) {
		for (int i = 0; i < students.length; i++) {
			students[i].setScores(e);
		}
	}
	
	public void info() {
		System.out.printf(">>> %s <<<\n", lecturename);
		System.out.println("--------------------");
		for (int i = 0; i < students.length; i++) {
			students[i].info();
			System.out.println("--------------------");
		}
		System.out.println("강좌 전체 평균 : " + new DecimalFormat(".00").format(getLectureAverage()) + "점");
	}
	
	public double getLectureAverage() {
		double average = 0;
		for (int i = 0; i < students.length; i++) {
			average += students[i].getAverage();
		}
		average /= students.length;
		return average;
	}
	
}
