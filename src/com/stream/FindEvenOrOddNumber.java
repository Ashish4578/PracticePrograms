package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOrOddNumber {
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> isEven = array.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> isOdd = array.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(array);
		System.out.println(isEven);
		System.out.println(isOdd);
	}
}
