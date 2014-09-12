package org.minazou67.sample.se7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Sample {

	public static void main(String[] args) {
		try {
			nio2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void nio2() throws IOException {
		Path sampleFilePath = Paths.get("sample.txt");
		// ファイルの存在チェック
		if (!Files.notExists(sampleFilePath)) {
			return;
		}
		// ファイルの新規作成
		sampleFilePath = Files.createFile(Paths.get("sample.txt"));
		// ファイルへ書き込み
		String content = "line1\nline2\n";
		Files.write(sampleFilePath, content.getBytes());
		// ファイルからすべての行を読み取り
		for (String line : Files.readAllLines(sampleFilePath,
				Charset.defaultCharset())) {
			System.out.println(line);
		}
		// ファイルが存在している場合は削除
		System.out.println(Files.deleteIfExists(sampleFilePath));
	}
}
