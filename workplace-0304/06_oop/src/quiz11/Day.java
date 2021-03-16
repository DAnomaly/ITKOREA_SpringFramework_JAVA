package quiz11;

public class Day {
	
	// field
	private String schedule;
	
	// constructor
	
	// method
	public String getSchedule() {
		return schedule;
	}
	
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void info() {
		if(schedule == null || schedule.isEmpty()) {
			System.out.println("이날의 일정이 없습니다");
		} else {
			System.out.println(schedule);
		}
	}
	
}
