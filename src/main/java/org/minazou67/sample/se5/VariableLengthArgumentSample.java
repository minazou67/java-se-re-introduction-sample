package org.minazou67.sample.se5;

public class VariableLengthArgumentSample {

	// 可変長引数のメソッド
	public static void variableLengthArgument(String... args) {
		for (String arg : args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args) {
		variableLengthArgument("hoge", "fuga");
	}
}
