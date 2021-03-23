package ex08_map;

import java.util.HashMap;
import java.util.Map;

/*
 *  HashMap 클래스
 *  1. Map 인터페이스를 구현한 클래스입니다
 *  2. 데이터를 쌍(pair)으로 저장하는 클래스입니다
 *  3. 키(key)-값(value)의 쌍으로 저장됩니다
 *     1) 키(key) : 중복이 불가능합니다
 *     2) 값(value) : 중복이 가능합니다
 *	4. 인덱스의 역할을 키(key)가 수행합니다.
 */


public class HashMapMainClass {

	public static void main(String[] args) {
		
		Map<String,Integer> sungjuk = new HashMap<String, Integer>();
		
		// 1. 추가 : put(key, value)
		sungjuk.put("지구력",80);
		sungjuk.put("근력",70);
		sungjuk.put("인내력",90);
		
		sungjuk.put("지구력",100); // 기존 지구력을 덮어씁니다.

		// 2. 삭제 : remove(key)
		sungjuk.remove("근력");
		
		// 3. 요소 가져오기 : get(key)
		System.out.println(sungjuk.get("지구력"));
		System.out.println(sungjuk.get("인내력"));
		
		// 4. 크기 : size()
		System.out.println("sungjuk.size():" + sungjuk.size());
		
		// 5. 출력
		System.out.println(sungjuk);
		
		// 6. 순회는 방법이 많아서 따로 진행합니다
		
		
	}
	
}
