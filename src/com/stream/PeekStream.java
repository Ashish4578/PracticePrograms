package com.stream;

import java.util.Arrays;
import java.util.List;

public class PeekStream {
	public static void main(String[] args) {
		// peak is track or peek in stream while executing and doesn't perform
		// operations
		List<String> words = Arrays.asList("cat", "apple", "dog", "horse", "car", "mouse", "ant", "lemon", "fox",
				"grape", "parrot");
		List<String> result = words.stream().filter(s -> s.length() > 4).peek(s -> System.out.print(s + " "))
				.map(s -> s.toUpperCase()).peek(s -> System.out.print(s + " ")).toList();
		System.out.println("\n" + result);
	}
}
