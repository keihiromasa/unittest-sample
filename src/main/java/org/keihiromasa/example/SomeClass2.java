package org.keihiromasa.example;

public class SomeClass2 {

	public static String greet() {
		if (new SomeClass1().isAMNow()) {
			return "おはようございます！";
		}
		return "こんにちは！";
	}
}
