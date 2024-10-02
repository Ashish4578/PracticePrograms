package com.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(1, 2, 4, 5, 3, 6, 7, 8, 9);
		List<Integer> isEven = array.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

//		.forEach(System.out::print);
		Iterator<Integer> itr = isEven.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");

		}

	}
}
