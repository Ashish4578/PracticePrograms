package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		List<Integer> array = Arrays.asList(1, 2, 4, 5, 3, 6, 7, 8, 9, 10);
		Map<Integer, Integer> map = array.stream().collect(Collectors.toMap(n -> n, n -> n * n));
		System.out.println(map);

		map.forEach((key, value) -> System.out.println("key " + key + ", value " + value));

	}
}
