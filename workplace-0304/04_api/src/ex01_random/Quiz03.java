package ex01_random;

/*
 * 3. 윷놀이
 * "도", 1칸 이동한다.
 * "개", 2칸 이동한다
 * "걸", 3칸 이동한다
 * "윷", "개", 6칸 이동한다
 * "모", "모", "도", 11칸 이동한다
 */

public class Quiz03 {

	public static void main(String[] args) {
	
		final String[] YUT = {"도", "개", "걸", "윷", "모"};
		int move = 0;
		
		out : while(true) {
			// 윷을 프로그램이 던집니다.
			int idx = (int) (Math.random() * 5);
			System.out.print(YUT[idx] + ", ");
			move += idx + 1;
			switch (idx) {
			case 3:
			case 4:
				continue out;
			}
			break;
		}
		
		System.out.println(move + "칸 이동한다");
		
		
	}
	
}
