package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringWithGreaterLengthThanFour {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "apple", "dog", "horse", "car", "mouse", "ant", "lemon", "fox",
				"grape", "parrot");
		List<String> greaterLengthThanFour = words.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
		System.out.println(greaterLengthThanFour);

		// greater Than four and sorted its length
		Map<String, Integer> greaterLengthThanFourWithLength = words.stream().filter(s -> s.length() > 4)
				.collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(greaterLengthThanFourWithLength);
	}
}
