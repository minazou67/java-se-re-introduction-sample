package org.minazou67.sample.se5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpansionLoopSample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		expansionLoop(list);
	}

	public static void expansionLoop(List<Integer> list) {

		if (list == null) { return; }

		// 古い記法
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 新しい記法
		for (Integer value : list) {
			System.out.println(value);
		}
	}
}
