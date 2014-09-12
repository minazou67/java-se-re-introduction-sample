package org.minazou67.sample.se8;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptSample {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		System.out.println("engine = " + engine);
		try {
			// 指定されたスクリプトの実行
			engine.eval("print('Hello, World');");
			engine.eval("function sum(a, b) { return a + b; }");
			// 関数の呼び出し
			Invocable inv = (Invocable) engine;
			System.out.println(inv.invokeFunction("sum", 10, 20));
		} catch (ScriptException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}