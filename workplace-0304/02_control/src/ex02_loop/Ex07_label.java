package ex02_loop;

public class Ex07_label {
	
	public static void main(String[] args) {
		
		// label
		// 1. 소스코드의 특정 위치를 지정하는 방법입니다.
		// 2. 방법
		//    Label : 소스코드
		
		// dan X n = ( dan * n )
		
		outer : for (int dan = 2; dan <= 9; dan++) {
			for (int n = 1; n <= 9; n++) {
				if(dan >= 5 && n >= 6 )
					break outer;
				System.out.print(dan + " X " + n + "=" + (dan * n) + " ");
			}
			System.out.println();
		}
		
	}
	
}
