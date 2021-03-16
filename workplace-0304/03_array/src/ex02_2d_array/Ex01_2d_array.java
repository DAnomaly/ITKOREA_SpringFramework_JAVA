package ex02_2d_array;

public class Ex01_2d_array {

	/*
		2차원 배열
		1. 2차원 배열은 "테이블(표)" 형태로 이해하면 됩니다
		2. 고정형 2차원 배열과 가변형 2차원 배열이 있습니다
		3. 고정형 선언
			1) int[][] a = new int[3][2]; //3행 2열
			2) int[][] a;
			   a = new int[3][2];
		4. 가변형 선언
			1) int[][] a = new int[3][]; // 3행 n열
			   a[0] = new int[2];
			   a[1] = new int[3];
			   a[2] = new int[4];
		5. 초기화
			1) int[][] a = {
			   {1, 2},
			   {3, 4},
			   {5, 6}
			}
			2) int[][] a = {
				{1},
				{1,2},
				{1,3,5}
			}
	 */
	public static void main(String[] args) {
		// 차원 배열 선언 잋 생성
		int[][] a = new int[3][2];
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60;
		
		System.out.print(a[0][0] + " ");
		System.out.print(a[1][0] + " ");
		System.out.println();
		System.out.print(a[1][0] + " ");
		System.out.print(a[1][1] + " ");
		System.out.println();
		System.out.print(a[0][0] + " ");
		System.out.print(a[1][0] + " ");
		System.out.println();
		
		System.out.println("-----for문 이용-----");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
}
