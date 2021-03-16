package ex02_2d_array;

public class Ex02_2d_reference {

	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2},
				{3, 4, 5 ,6},
				{7, 8, 9}
		};
		
		System.out.println(a);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);

		// for문으로 순회합니다.
		for (int i = 0; i < a.length; i++) {
			System.out.printf("[ ");
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("]");
		}
		
	} 
}
