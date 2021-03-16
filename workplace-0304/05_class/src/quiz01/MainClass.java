package quiz01;

import java.sql.Date;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.title = "어린왕자";
		book.auther = "생텍쥐베리";
		book.price = 10000;
		book.stock = 20;
		Calendar date = Calendar.getInstance();
		date.set(2020, 0, 10);
		long timestamp = date.getTimeInMillis();
		book.pubDate = new Date(timestamp);
		book.isBest = true;
		
		System.out.println(book.title);
		System.out.println(book.auther);
		System.out.println(book.price);
		System.out.println(book.stock);
		System.out.println(book.pubDate);
		System.out.println(book.isBest ? "베스트셀러" : "일반서적");
		
	}
	
}
