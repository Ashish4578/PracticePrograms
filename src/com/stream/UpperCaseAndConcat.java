package com.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseAndConcat {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "Python", "React", "Angular");

		// print only sorting list
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		// print after converting to upperCase and sort
		List<String> convertUpperCaseWithSort = list.stream().map(String::toUpperCase).sorted()
				.collect(Collectors.toList());
		System.out.println(convertUpperCaseWithSort);

		// sort, change with upper case and join them as a String
		String simpleString = list.stream().map(String::toUpperCase).sorted().collect(Collectors.joining(" "));
		System.out.println(simpleString);

		// sort, change with upper case and join them as a string list
		List<String> program = list.stream().filter(s -> s.toLowerCase().contains("a")).map(String::toUpperCase)
				.sorted().collect(Collectors.toList());
		System.out.println(program);

	}
}
