package ex02_2d_array;

public class Ex03_advanced_for {
	
	public static void main(String[] args) {
		
		int[][] a= {
				{1,2},{3,4,5}
		};
		
		System.out.println("-----a[0]와 a[1]의 주소를 출력-----");
		// a -> a[0], a[1]
		for (int[] is : a) {
			System.out.println(is);
		}
		
		System.out.println("-----a안의 모든 숫자를 표현-----");
		// a[0] -> 1, 2
		// a[1] -> 3, 4, 5
		for (int[] is : a) {
			System.out.print("[ ");
			for (int num : is) {
				System.out.print(num + " ");
			}
			System.out.println("]");
		}
		
	}
	
}
