package quiz03;

public class MainClass {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.set("james",50,60,60); // 인수 : 이름, 국어, 영어, 수학
		System.out.println("평균 : " + s.getAverage());
		System.out.println(s.getPass()); // 평균 60 이상 "합격", 나머지 "불합격"
	}
	
}
