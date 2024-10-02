package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindGreaterThanTen {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 8, 2, 7, 5);
		Optional<Integer> num = numbers.stream().filter(n -> n > 10).findFirst();
		System.out.println(num.orElse(0));
	}
}
