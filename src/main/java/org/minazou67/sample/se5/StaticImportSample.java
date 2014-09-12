package org.minazou67.sample.se5;

// 静的インポート
import static java.lang.Math.*;

public class StaticImportSample {

	public static void main(String[] args) {
		// 古い記法
		System.out.println("cos(PI) = " + Math.cos(Math.PI));
		// 新しい記法
		System.out.println("cos(PI) = " + cos(PI));
	}
}
