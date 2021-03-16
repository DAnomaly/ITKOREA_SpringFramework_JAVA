package ex03_api;

// 1. String과 StringBuilder의 성능 비교
// 1) 1 ~ 10000을 모두 연결합니다.

public class Quiz01 {

	public static void main(String[] args) {
		
		Long start = System.nanoTime();
		
		String str = "";
		for (int i = 1; i <= 10000; i++) {
			str += i;
		}
		
		Long result = System.nanoTime() - start;
		System.out.println(result);
		
		str = "";
		
		start = System.nanoTime();
		
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 1; i <= 10000; i++) {
			sb.append(i);
		}
		
		result = System.nanoTime() - start;
		System.out.println(result);
		
		start = System.nanoTime();
		
		StringBuffer bf = new StringBuffer("");
		
		for (int i = 1; i <= 10000; i++) {
			bf.append(i);
		}
		
		result = System.nanoTime() - start;
		System.out.println(result);
		
		
	}
	
}
