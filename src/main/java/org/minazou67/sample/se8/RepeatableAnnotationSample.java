package org.minazou67.sample.se8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

public class RepeatableAnnotationSample {

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(MyAnnotations.class)
	public @interface MyAnnotation {
		String value();
	}
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface MyAnnotations {
		MyAnnotation[] value();
	}
	@MyAnnotation("hoge")
	@MyAnnotation("fuga")
	public static class MyClass {
		public void print() {
			MyAnnotations annotations =
					MyClass.class.getDeclaredAnnotation(MyAnnotations.class);
			Arrays.stream(annotations.value()).forEach(System.out::println);
		}
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.print();
	}
}
