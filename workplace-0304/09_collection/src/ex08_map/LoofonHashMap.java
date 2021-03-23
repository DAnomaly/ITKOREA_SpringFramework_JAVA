package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoofonHashMap {

	public static void main(String[] args) {

		Map<String, String> me = new HashMap<String, String>();

		me.put("name", "민경태");
		me.put("age", 44 + "");
		me.put("phone", "010-8765-8765");

		// 1. 향상 for문은 key만 뺍니다.
		// me에서 Key만 빼는 메소드 : keySet()
		Set<String> set = me.keySet();
		for (String key : set) {
			System.out.print(key + " ");
			System.out.println(me.get(key));
		}

		System.out.println("-------------");

		// 2. Iterator 인터페이스
		Iterator<String> iter = me.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + ":" + me.get(key));
		}

		System.out.println("-------------");

		// 3. 데이터 쌍(pair)으로 뺄 수 있습니다
		// entry : key와 value를 묶어서 entry라 한다
		//   1) for
		Set<Entry<String, String>> entrySet = me.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("-------------");

		//   2) Iterator
		Iterator<Entry<String, String>> iter_entry = me.entrySet().iterator();
		while (iter_entry.hasNext()) {
			Entry<String, String> entry = iter_entry.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

	}

}
