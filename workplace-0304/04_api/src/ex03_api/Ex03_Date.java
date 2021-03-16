package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		
		// java.sql.Date
		// DB의 Date타입에 맞게끔 wrapping 처리한 클래스입니다.
		long date = System.currentTimeMillis();
		Date today = new Date(date);
		
		System.out.println(today);
		
		
	}
}
