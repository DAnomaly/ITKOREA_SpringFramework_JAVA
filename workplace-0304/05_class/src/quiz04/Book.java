package quiz04;

public class Book {
	String title;
	String writer;
	int price;
	
	public Book() {
		writer = "미상";
	}
	
	void set(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	void set(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	void set(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	void info(){
		System.out.printf("제목: %s, 저자: %s, 가격: %d원 \n", 
				title, writer, price);
	}
	
}
