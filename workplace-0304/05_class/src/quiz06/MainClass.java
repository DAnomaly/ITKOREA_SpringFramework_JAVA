package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book("홍길동전", 5000);
		Book b3 = new Book("어린왕자","생텍쥐베리",10000);
		
		b1.info();
		b2.info();
		b3.info();
		
	}
}
