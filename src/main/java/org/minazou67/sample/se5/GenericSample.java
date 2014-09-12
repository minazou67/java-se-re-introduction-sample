package org.minazou67.sample.se5;

public class GenericSample {

	public static class MyClass<K, V> {
		private K key;
		private V value;
		public void setKeyValue(K key, V value) {
			this.key = key;
			this.value = value;
		}
		public K getKey() { return key; }
		public V getValue() { return value; }
	}

	public static void main(String[] args) {
		MyClass<String, String> mc = new MyClass<String, String>();
		mc.setKeyValue("1", "hoge");
		String key = mc.getKey();
		System.out.println("key = " + key);
	}
}
