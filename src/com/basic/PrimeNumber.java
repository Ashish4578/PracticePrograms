package com.basic;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {
	public static boolean isPrimeNumber(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// using static method
//		System.out.println(isPrimeNumber(7));

		// using predicate number
		IntPredicate isPrime = num -> num > 1 && IntStream.range(2, num).noneMatch(divisor -> num % divisor == 0);
//		IntStream.range(1, 101).filter(isPrime).forEach(System.out::println);

//		for (int i = 0; i < 10; i++) {
//			if (i == 5)
//				continue;
//			System.out.println(i);
//		}
//		for (int i = 10; i < 20; i++) {
//			if (i == 15)
//				break;
//			System.out.println(i);
//		}

//		float f=3.4f;
//		double d=5.88d;
//		
//		byte a=10;
//		byte b=12;
//		byte c=(byte) (a+b);
//		System.out.println(c);

		Person p = new Person("Ashish", "Bidkin");
		System.out.println(p.name()+ " " + p.address());
		System.out.println(p.greet());

	}
}
