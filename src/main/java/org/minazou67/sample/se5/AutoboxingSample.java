package org.minazou67.sample.se5;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingSample {

	public static void main(String[] args) {
		autoboxing();
	}

	public static void autoboxing() {

		List<Integer> list = new ArrayList<Integer>();
		// 古い記法
		list.add(new Integer(1));
		int x = list.get(0).intValue();
		// 新しい記法
		list.add(2);
		int y = list.get(1);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
