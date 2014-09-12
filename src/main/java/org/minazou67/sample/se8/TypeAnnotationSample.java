package org.minazou67.sample.se8;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class TypeAnnotationSample {

	// 型アノテーション
	@Target(ElementType.TYPE_USE)
	private @interface MyChecker {}

	// 型使用部分に型アノテーションを付与
	@MyChecker
	public static class MyClass extends @MyChecker Object {
		private @MyChecker String text;

		@MyChecker
		public <@MyChecker T> List<T> execute(@MyChecker T value)
				throws @MyChecker IOException {

			@MyChecker List<@MyChecker T> list = new @MyChecker ArrayList<>();
			list.add(value);
			return list;
		}
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		try {
			myClass.execute(1);
		} catch (@MyChecker IOException e) {
			e.printStackTrace();
		}
	}

}
