package com.adv.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class DataProcessing {

    public static void main(String[] args) {
        // Sample Data
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "London"),
                new Person("Charlie", 45, "New York"),
                new Person("David", 22, "Paris"),
                new Person("Eve", 30, "London"),
                new Person("Frank", 50, "New York")
        );

        System.out.println("--- Original List ---");
        people.forEach(System.out::println);
        System.out.println("\n" + "=".repeat(40));

//        Get the names of all people who are 30 years old.
        List<String> ageThirties = people.stream().filter(p -> p.getAge() == 30).map(Person::getName).toList();
        ageThirties.forEach(System.out::println);

//        Calculate the total age of everyone in the list.
        int totalAge = people.stream().mapToInt(Person::getAge).sum();
        System.out.println("Total age: " + totalAge);

//        Get a list of all unique cities represented in the data, sorted alphabetically.
        List<String> uniqueCities = people.stream().map(Person::getCity).distinct().toList();
        System.out.println("Unique cities: " + uniqueCities);

//        Find the first person older than 40.
        List<String> olderThanForty = people.stream().filter(p -> p.getAge() > 40).map(Person::getName).toList();
        olderThanForty.forEach(System.out::print);

    }

}
