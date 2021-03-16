package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex05_SimpleDateFormat {

	/*
	  	날짜 / 시간 페턴 (pattern)
	  	1. 년 : yy, yyyy
	  	2. 월 : M, MM
	  	3. 일 : d, dd
	  	4. 요일 : E (일 ~ 토)
	  	5. 오전/오후 : a (오전/오후)
	  	6. 시
	  	   1) h, hh : 12시
	  	   2) H, HH : 24시
	  	7. 분 : m, mm
	  	8. 초 : s, ss
	 */
	
	public static void main(String[] args) {
		
		Date date = new Date(System.currentTimeMillis());
		String pattern = "yyyy-MM-dd (E) | a hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println("non-patern : " + date);
		System.out.println("patern     : " + sdf.format(date));
		
	}
	
}
