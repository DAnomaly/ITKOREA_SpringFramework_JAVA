package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calendar {

	public static void main(String[] args) {
		
		// java.util.Calendar
		// 1. 자바에서 날짜와 시간을 처리하는 주요 클래스입니다.
		// 2. 미리 정해진 필드를 이용해서 각 단위를 추출할 수 있습니다.
		
		// 현재 날짜와 시간 생성
		Calendar date = Calendar.getInstance();
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH) + 1; 
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK);
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR); // 0 ~ 11
		int hour2 = date.get(Calendar.HOUR_OF_DAY); // 0 ~ 23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		
		String weekStr = "";
		switch (weekNo) {
		case Calendar.SUNDAY:
			weekStr = "SUN";
			break;
		case Calendar.MONDAY:
			weekStr = "MON";
			break;
		case Calendar.TUESDAY:
			weekStr = "TUE";
			break;
		case Calendar.WEDNESDAY:
			weekStr = "WED";
			break;
		case Calendar.THURSDAY:
			weekStr = "THR";
			break;
		case Calendar.FRIDAY:
			weekStr = "FRI";
			break;
		case Calendar.SATURDAY:
			weekStr = "SAT";
			break;
		}
		
		
		System.out.printf("%d-%d-%d (%s)\n",year,month,day,weekStr);
		System.out.printf("%s %d:%d:%d.%d\n",ampm == 0 ? "AM" : "PM",hour,minute,second,millis);
		System.out.printf("%d:%d:%d.%d\n",hour2,minute,second,millis);
				
		// 날짜 변경하기
		date.set(1990, 10, 10, 9, 30, 40); // 날짜 : 1990/11/10 9:30:40
		
		// Calendar를 이용한 타임스탬프 알아내기
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
		
		// Calendar -> Date
		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		// java.sql.Date -> Calendar
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		
		
		
		
		
		
	}
}
