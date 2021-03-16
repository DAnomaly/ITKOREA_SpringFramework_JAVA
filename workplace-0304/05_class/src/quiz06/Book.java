package quiz06;

public class Book {

	String title;
	String writer;
	int price;

	Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	Book(String title, int price) {
		this(title, "미상", price);
	}

	Book() {
		this("없음", "미상", 0);
	}

	void info() {
		System.out.printf("제목 : %s, 저자 : %s, 가격 : %d원\n", title, writer, price);
	}

}
