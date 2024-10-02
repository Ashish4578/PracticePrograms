package com.stream;

import java.util.Arrays;
import java.util.List;

public class CheckOnlyOddNumbers {
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(4);
		
		System.out.println(onlyOddNumbers(array));
	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		return list
				.parallelStream() // parallel stream for faster processing
				.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}
}
