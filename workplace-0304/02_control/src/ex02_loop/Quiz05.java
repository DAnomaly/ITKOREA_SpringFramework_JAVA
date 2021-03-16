package ex02_loop;

public class Quiz05 {

	// 아래와 같은 모습으로 출력해 보기
	// 2x1=2 3x1=3 ... 9x1=9
	// 2x2=4 3x2=6 ... 9x2=18
	// ...
	// 2x9=18 3x9=27 ... 9x9=81
	
	
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i+"x"+j+"="+(i*j) + "\t");
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
