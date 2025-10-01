package com.stream;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
}
public class FindFirstTwoMaxSalaryElements {

    public static void main(String[] args) {
        Employee employees[] = {
                new Employee("ashish", "intern", 27000),
                new Employee("RAM", "intern", 23000),
                new Employee("ABC", "lead", 70000),
                new Employee("PQR", "manager", 64000),
                new Employee("DEF", "lead", 723937),
                new Employee("GHI", "lead", 635263),
                new Employee("Yogesh", "intern", 30000),
                new Employee("shym", "intern", 28000),
                new Employee("STU", "manager", 76000),
                new Employee("op", "lead", 73000),
                new Employee("XYZ", "manager", 40000)
        };

        Map<String, List<Employee>> employeeByRole=Arrays.stream(employees)
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(
                        Collectors.toList(),list->list.stream()
                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                .limit(2)
                                .collect(Collectors.toList())
                )));

        System.out.println(employeeByRole+"\n");

    }

}
