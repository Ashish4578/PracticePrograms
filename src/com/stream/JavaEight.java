package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEight {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("mango");
		list.add("grapes");
		list.add("banana");
		list.add("oranges");

		// iterate using for each loop
		list.stream().forEach(System.out::println);

		// Collect with letter a
		List<String> charWithA = list.stream().filter(s -> s.contains("e")).collect(Collectors.toList());
		System.out.println(charWithA.toString());
	}
}
