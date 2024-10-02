package com.basic;

public record Person(String name, String address) {

	public String greet() {
		return "Hello "+name+" and you are from "+address;
	}
}
