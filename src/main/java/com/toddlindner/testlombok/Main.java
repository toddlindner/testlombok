package com.toddlindner.testlombok;

public class Main {

	public static void main(String[] args) {
		System.getProperties().entrySet().stream()
				.map(e -> e.getKey() + "=" + e.getValue())
				.sorted()
				.forEach(System.out::println);
		System.out.println();
		System.out.println();
		System.out.println("Test " + new Foo("b", 4));
	}
}
