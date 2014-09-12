package org.minazou67.sample.se8;

import java.util.Optional;

public class OptionalSample {
	public static class MyClass {
		// Optional 型を返却するメソッド
		public static Optional<String> getHoge(String value) {
			// null の場合は空の Optional を返却
			return Optional.ofNullable(value);
		}
	}
	public static void main(String[] args) {
		System.out.println(MyClass.getHoge("あ").orElse("い"));
		System.out.println(MyClass.getHoge(null).orElseGet(() -> "う"));
		MyClass.getHoge("え").ifPresent(hoge -> System.out.println(hoge));
	}
}
