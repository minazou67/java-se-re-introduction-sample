package org.minazou67.sample.se8;

public class DefaultMethodSample {

	// デフォルトメソッドを定義したインターフェース
	public interface MyInterface {
		default String find() {
			return "10";
		}
	}
	// 実装クラスでオーバーライド可能
	public static class MyClass implements MyInterface{
		public String find() {
			return "20";
		}
	}
	// オーバーライドしたメソッドの呼び出し
	public static void main(String[] args) {
		System.out.println(new MyClass().find());
		// 20
	}
}
