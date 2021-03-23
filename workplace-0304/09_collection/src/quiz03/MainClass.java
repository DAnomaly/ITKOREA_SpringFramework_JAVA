package quiz03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		Set<Integer> lotto = new HashSet<Integer>();

		while (lotto.size() != 6) {
			lotto.add((int) (Math.random() * 45 + 1));
		}

		List<Integer> lotto_list = new ArrayList<>();

		lotto_list.addAll(lotto);
		Collections.sort(lotto_list);

		System.out.println(lotto_list);

	}

}
