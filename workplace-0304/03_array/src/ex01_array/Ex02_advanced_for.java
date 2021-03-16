package ex01_array;

public class Ex02_advanced_for {
	
	public static void main(String[] args) {
		
		// advanced_for : 향상 for문 (foreach)
		// 배열의 순회를 인덱스 없이 처리하는 for문입니다.
		
		int[] arr = {10, 20, 30};
		
		System.out.println("-----foreach-----");
		int count = 0; 
		for (int i : arr) { // arr배열의 모든 요소를 변수 i로 하나씩 전달합니다
			System.out.println(count++ + "번 : " +i);
		}
		
		System.out.println("-----배열의 요소 1증가-----");
		// 모든 배열의 요소를 1 증가시키고 싶습니다.
		
		/*
		for (int i : arr) {
			i++;
		}
		*/
		// 향상 for문은 배열의 요소에 관여할 수 없고 값만 가져와 쓸 수 있다.
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		
		for (int i : arr) {
			System.out.println(count++ + "번 : " +i);
		}
		
		
	}
	
}
