package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		
		for (int out = 1; out <= 10; out++) {
			
			for (int in = 10; in <= 50; in+=10) {
				
				System.out.println(out + ", " + in);
				
			} // inner
			
		} // outer
		
		System.out.println();
		
		// 1주차 1일차 1교시입니다
		// 1주차 1일차 2교시입니다
		// 1주차 1일차 3교시입니다
		// ...
		// 총 5주차 총 5일 총 8교시
		for (int week = 1; week <= 5; week++) {
			for (int day = 1; day <= 5; day++) {
				for (int time = 1; time <= 8; time++) {
					System.out.println(week + "주차 " + day + "일차 " + time + "교시입니다");
				}
			}
		}
		
		
	}
}
