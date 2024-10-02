package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		List<String> number = Arrays.asList("Ashish", "saurabh", "Ved", "Pratik");

		List<String> sortedNumber = number.stream().sorted().toList();
		System.out.println(sortedNumber);

		// descending order
		List<String> decendingOrder = number.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(decendingOrder);

		// reverse element and print in ascending order
		List<String> reverse = number.stream().map(SortString::reverseElement).sorted().toList();
		System.out.println(reverse);
	}

	static String reverseElement(String s) {
		if (s == null || s.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
