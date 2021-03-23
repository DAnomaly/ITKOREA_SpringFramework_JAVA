package ex06_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMainClass {

	public static void main(String[] args) {

		// LinkedHashSet 클래스는 저장된 요소들의 순서가 유지된다.

		Set<String> set = new LinkedHashSet<>();

		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("html");
		set.add("css");
		set.add("javascript");
		set.add("html");
		set.add("css");
		set.add("javascript");

		for (String str : set) {
			System.out.print(str + " ");
		}

	}

}
