package org.minazou67.sample.se5;

public class EnumSample {

	enum Fruit { APPLE, ORANGE, GRAPE }

	public static void main(String[] args) {

		Fruit fruit = Fruit.ORANGE;

		if (fruit == Fruit.GRAPE) {
			System.out.println("fruit is " + Fruit.GRAPE);
		} else {
			System.out.println("fruit is not " + Fruit.GRAPE);
		}
	}
}
