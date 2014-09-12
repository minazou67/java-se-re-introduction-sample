package org.minazou67.sample.se8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeSample {

	public static void main(String[] args) {
		DateAndTimeSample1();
		DateAndTimeSample2();
	}

	public static void DateAndTimeSample1() {
		// 日付オブジェクトの生成、演算、フォーマット
		System.out.println(LocalDate.now());
		LocalDate localDate = LocalDate.of(2014, 1, 31);
		System.out.println(localDate.plusDays(10));
		System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
		// 時間オブジェクトの生成、演算、フォーマット
		System.out.println(LocalTime.now());
		LocalTime localTime = LocalTime.of(13, 58);
		System.out.println(localTime.minusHours(10));
		System.out.println(localTime.format(DateTimeFormatter.ISO_TIME));
		// 日時オブジェクトの生成、演算、フォーマット
		System.out.println(LocalDateTime.now());
		LocalDateTime localDateTime = LocalDateTime.of(2014, 1, 31, 13, 58);
		System.out.println(localDateTime.plusYears(10));
		System.out.println(localDateTime.format(DateTimeFormatter
				.ofPattern("yyyy/MM/dd HH:mm:ss")));
	}

	public static void DateAndTimeSample2() {
		// タイムゾーンなし
		LocalDateTime localDateTime = LocalDateTime.of(2014, 1, 31, 13, 58);
		System.out.println(localDateTime);
		// UTCからの時差だけを管理
		OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime,
				ZoneOffset.ofHours(9));
		System.out.println(offsetDateTime);
		// タイムゾーンあり
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,
				ZoneId.systemDefault());
		System.out.println(zonedDateTime);
	}
}
