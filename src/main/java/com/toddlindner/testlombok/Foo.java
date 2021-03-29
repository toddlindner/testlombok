package com.toddlindner.testlombok;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Foo {
	private final String a;
	private final int b;
}
