package org.minazou67.sample.se8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceSample {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes");
		// メソッド参照
		fruits.stream().filter(s -> s.length() > 2).forEach(System.out::println);
		// コンストラクタ参照
		Function<char[], String> text = String::new;
		System.out.println(text.apply(new char[]{ 'あ', 'い', 'う'}));
	}
}
