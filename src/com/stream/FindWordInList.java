package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordInList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mouse ", "Keyboard ", "Mic ", "Screen ", "thkgmlj ");

		list.stream().filter(s -> s.toLowerCase().contains("m")).collect(Collectors.toList())
				.forEach(System.out::print);

		System.out.println("\nProgram end");
	}
}
