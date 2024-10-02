package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAge {
	class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	}

	public static void main(String[] args) {
		GroupByAge gba = new GroupByAge();
		List<GroupByAge.Person> people = Arrays.asList(gba.new Person("Alice", 30), gba.new Person("Bob", 25),
				gba.new Person("Charlie", 30), gba.new Person("David", 25), gba.new Person("Bob", 40));

		// group by age
		Map<Integer, List<String>> groupByAge = people.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println("Group By Age \n" + groupByAge);

		// group by name
		Map<String, List<Integer>> groupByName = people.stream().collect(
				Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())));
		System.out.println("Group by Name \n" + groupByName);

	}
}
