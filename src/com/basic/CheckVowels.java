package com.basic;

public class CheckVowels {
	public static void main(String[] args) {
		String str = "mshjkl";
		System.out.println(str.toLowerCase().matches(".*[aeiou].*") ? " Contain aeiou" : " Not contain anything ");

	}
}
