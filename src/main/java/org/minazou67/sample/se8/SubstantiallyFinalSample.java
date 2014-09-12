package org.minazou67.sample.se8;

import java.util.Arrays;
import java.util.List;

public class SubstantiallyFinalSample {

	public static void main(String[] args) {
		// 実質的 final なローカル変数
		int value1 = 10;
		List<Integer> values = Arrays.asList(10, 20, 30);
		// ラムダ式
		values.stream().
			forEach(value2 -> System.out.println(value1 + value2));
		// 20, 30, 40
	}
}
