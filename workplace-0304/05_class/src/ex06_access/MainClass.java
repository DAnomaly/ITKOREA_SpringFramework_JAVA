package ex06_access;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 클래스에 생성자가 없는 경우에는
		// "디폴트 생성자"가 자동으로 사용됩니다
		// public Person() { }
		
		Person p = new Person();
		
		// p.name		(X)
		// p.age		(X)
		// p.isKorean	(X)
		
		p.setName("Laffey");
		p.setAge(22);
		p.setKorean(false);
		
		System.out.println("p.getName() : " + p.getName());
		System.out.println("p.getAge()  : " + p.getAge());
		System.out.println(p.isKorean() ? "한국인" : "외국인");
		
	}
	
}
