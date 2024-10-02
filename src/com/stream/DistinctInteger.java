package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctInteger {
	public static void main(String[] args) {
		// remove duplication values
		List<Integer> numbers = Arrays.asList(23, 35, 4, 5, 5, 8, 43, 3, 2, 34, 24, 22, 1, 2, 5, 7, 8, 8, 9, 4, 2, 9,
				3);
		List<Integer> sorted = numbers.stream().sorted().toList();
		System.out.println(sorted);

		List<Integer> DistinctNumber = numbers.stream().distinct().sorted().toList();
		System.out.println(DistinctNumber);

		// counting how much time repeated
		Map<Integer, Long> repeatCount = numbers.stream().sorted()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(repeatCount);
	}
}
