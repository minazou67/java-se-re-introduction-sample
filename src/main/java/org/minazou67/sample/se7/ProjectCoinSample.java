package org.minazou67.sample.se7;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectCoinSample {

	public static void main(String[] args) {

		binaryLiterals();
		numberLiterals();
		stringInSwitch();
		diamondOperator();
		tryWithResources();
		multiCatch();
	}

	public static void binaryLiterals() {

		byte b = 0b010101;
		short s = 0b010101010101;
		int i = 0B010101010101010101010101;
		long l = 0B0101010101010101010101010101010101010101L;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}

	public static void numberLiterals() {

		byte b = 0b0101_0101;
		short s = 0x1F_2E;
		int i = 1_234_567_890;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
	}

	public static void stringInSwitch() {
		String text = "hoge";
		switch (text) {
		case "fuga":
			break;
		case "piyo":
			break;
		default:
			break;
		}
	}

	public static void diamondOperator() {

		// 古い記法
		List<String> oldList = new ArrayList<String>();
		Map<String, Long> oldMap = new HashMap<String, Long>();
		List<Map<String, Long>> oldListMap = new ArrayList<Map<String, Long>>();

		// 新しい記法 (ダイヤモンド演算子)
		List<String> newList = new ArrayList<>();
		Map<String, Long> newMap = new HashMap<>();
		List<Map<String, Long>> newListMap = new ArrayList<>();

		System.out.println(oldList);
		System.out.println(oldMap);
		System.out.println(oldListMap);
		System.out.println(newList);
		System.out.println(newMap);
		System.out.println(newListMap);
	}

	public static void tryWithResources() {
		// セミコロン区切りで複数指定可能
		try (MyFileReader auto1 = new MyFileReader();
				MyFileReader auto2 = new MyFileReader()) {
			System.out.println("Processing!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// AutoCloseable インタフェースの実装クラス
	public static class MyFileReader implements AutoCloseable {
		@Override
		public void close() throws Exception {
			System.out.println("Close!");
		}
	}

	public static void multiCatch() {
		try {
			Field field = String.class.getField("hoge");
			System.out.println(field);
			// 複数例外を縦棒で区切って指定
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	// Exception 型ではなくより詳細な型を宣言可能
	public void rethrow(String name) throws NoSuchFieldException, SecurityException {
		try {
			if (name.equals("First")) {
				throw new NoSuchFieldException();
			} else {
				throw new SecurityException();
			}
		} catch (Exception e) {
			// キャッチしてそのまま再スロー
			throw e;
		}
	}
}
