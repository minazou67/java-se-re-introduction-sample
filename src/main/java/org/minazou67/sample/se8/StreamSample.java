package org.minazou67.sample.se8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {

	public static void main(String[] args) {
		createStream();
		createType();
		streamSample();
	}

	public static void createStream() {
		// 配列から生成
		String[] array = { "あ", "い", "う", "え", "お" };
		Stream<String> arrayStream = Arrays.stream(array);
		arrayStream.forEach(System.out::println);
		// リストから生成
		List<String> list = Arrays.asList("か", "き", "く", "け", "こ");
		Stream<String> listStream = list.stream();
		listStream.forEach(System.out::println);
		// ストリームを結合して生成
		Stream<String> concatStream =
				Stream.concat(Arrays.stream(array), list.stream());
		concatStream.forEach(System.out::println);
		// 範囲を指定して int のストリームを生成
		IntStream intStream = IntStream.range(0, 5);
		intStream.forEach(System.out::println);
	}

	public static void createType() {
		// 順次ストリーム
		Stream<Integer> sequentialStream = Arrays.asList(1, 2, 3).stream();
		sequentialStream.forEach(System.out::println);
		// 1, 2, 3
		// 並列ストリーム
		Stream<Integer> parallelStream = Arrays.asList(1, 2, 3).parallelStream();
		parallelStream.forEach(System.out::println);
		// 2, 3, 1
	}

	public static void streamSample() {
		// 要素数のカウント
		Stream<String> stream1 = Stream.of("あ", "い", "う", "え", "お");
		System.out.println(stream1.collect(Collectors.counting()));
		// 5

		// 要素の連結
		Stream<String> stream2 = Stream.of("か", "き", "く", "け", "こ");
		System.out.println(stream2.collect(Collectors.joining(",")));
		// か,き,く,け,こ

		// 要素を切り詰めてリストへ変換
		Stream<Integer> stream3 = Stream.of(1, 2, 3, 4, 5);
		List<Integer> list = stream3.limit(3).collect(Collectors.toList());
		System.out.println(list);
		// [1, 2, 3]

		// 偶数の要素を抽出して最大値を取得
		Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5);
		System.out.println(stream4.filter(s -> s % 2 == 0).max((s1, s2) -> s1 - s2));
		// Optional[4]
	}
}