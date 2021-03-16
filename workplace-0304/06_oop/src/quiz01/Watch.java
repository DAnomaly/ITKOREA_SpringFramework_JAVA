package quiz01;

public class Watch {
	
	private int hour ;
	private int minute;
	private int second;
	
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void addHour(int h) {
		hour += h;
		hour %= 24; 
	}
	
	public void addMinute(int m) {
		minute += m;
		if(minute >= 60) {
			addHour(minute / 60);
			minute %= 60;
		}
	}
	
	public void addSecond(int s) {
		second += s;
		if(second >= 60) {
			addMinute(second / 60);
			second %= 60;
		}
	}
	
	public void see() {
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
	}
	
}
