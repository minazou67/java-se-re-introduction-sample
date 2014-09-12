package org.minazou67.sample.se8;

public class StaticMethodSample {

	// 静的メソッドを定義したインターフェース
	public interface MyInterface {
		public static String find() {
			return "10";
		}
	}

	// 静的メソッドの呼び出し
	public static void main(String[] args) {
		System.out.println(MyInterface.find());
		// 10
	}
}
