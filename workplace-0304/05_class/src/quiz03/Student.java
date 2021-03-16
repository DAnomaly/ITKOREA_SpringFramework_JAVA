package quiz03;

public class Student {
	
	String name;
	int korean, english, math;
	
	void set(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	double getAverage() {
		return (korean + english + math)/3.0;
	}
	
	String getPass() {
		return getAverage() >= 60 ? "합격":"불합격";
	}

}
