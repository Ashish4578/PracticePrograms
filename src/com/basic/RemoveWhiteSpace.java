package com.basic;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "  shdfkhsdfkhs  ";
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (!Character.isWhitespace(c)) 
				sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
