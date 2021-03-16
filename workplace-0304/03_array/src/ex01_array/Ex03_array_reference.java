package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		
		// 배열은 reference type입니다
		
		int[] arr = new int[3];
		System.out.print("a의 주소 : ");
		System.out.println(arr); // new int[3]을 통해서 생성된 배열요소들의 주소가 저장되어 있습니다
		
		// --- 배열의 길이를 조정하는 코드 ---
		
		int[] a = {1, 2, 3}; 		// 배열 a의 길이 : 3
		int[] b = new int [10];     // 배열 b의 길이 : 10
		
		// b[0] = a[0], b[1] = a[1], b[2] = a[2]
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		// a에는 {1, 2, 3}이 저장된 주소가 있습니다
		// b에는 {1, 2, 3, 0, 0, 0, 0, 0, 0, 0}이 저장된 주소가 있습니다.
		
		a = b;
		System.out.println("-----a출력-----");
		System.out.println(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		System.out.println("-----b출력-----");
		System.out.println(b);
		for (int i : b) {
			System.out.print(i + " ");
		}
		
		// 위와 같은 절차로 인해 a가 b의 주소를 참조하게 된다
		// 기존의 a의 주소는 남아 있게 되는데
		// JVM이 아무도 참조하지 않는 주소가 생기면
		// Garbage Collection 기능이 알아서 참조하지 않는 주소를 삭제한다
		// Code : System.gc(); -- Garbage Collection을 독촉하여 실행
		
	}
}
