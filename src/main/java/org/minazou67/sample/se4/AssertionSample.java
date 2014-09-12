package org.minazou67.sample.se4;

public class AssertionSample {

	public static void main(String[] args) {

		Assertion.verify();
	}

	public static class Assertion {
		public static void verify() {
			int i = 1;
			// 詳細メッセージなし
			assert i == 1;
			System.out.println("1");
			// 詳細メッセージあり
			assert i == 2 : "i = " + i;
			System.out.println("2");
		}
	}
}
