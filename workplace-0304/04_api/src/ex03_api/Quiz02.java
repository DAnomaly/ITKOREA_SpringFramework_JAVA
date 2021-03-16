package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Quiz02 {

	/*
	 	2. Calendar를 활용해서 기념일 계산하기
		1) 두 개의 날짜를 만들고, 그 중 하나는 기념일로 수정
		2) 날짜의 차이를 구하고, 그 결과를 일 수로 출력하기
		
	 */
	
	public static void main(String[] args) {
		Calendar cl1 = Calendar.getInstance();
		Calendar cl2 = Calendar.getInstance();
		
		cl2.set(2020, 1, 22);

		Date dt1 = new Date(cl1.getTimeInMillis());
		Date dt2 = new Date(cl2.getTimeInMillis());
		long elapseTime = cl1.getTimeInMillis() - cl2.getTimeInMillis();

		long elapseDay = elapseTime/(1000*60*60*24);
		
		String strFormat = "yy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(strFormat);
		
		System.out.println("오늘   : " + sdf.format(dt1));
		System.out.println("기념일 : " + sdf.format(dt2));
		System.out.println("D-Day  : " + elapseDay);
		
		
	}
	
}
