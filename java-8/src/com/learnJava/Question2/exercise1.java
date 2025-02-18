package com.learnJava.Question2;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class exercise1 {

    static List<emp> empList = Arrays.asList(
            new emp("Alice", 30, "Female", "HR", 70000),
            new emp("Bob", 22, "Male", "IT", 80000),
            new emp("Cathy", 25, "Female", "HR", 85000),
            new emp("David", 35, "Male", "IT", 90000),
            new emp("Eve", 28, "Female", "Finance", 60000),
            new emp("Frank", 30, "Male", "IT", 95000),
            new emp("Grace", 40, "Female", "Sales", 74000),
            new emp("Heidi", 31, "Female", "Finance", 50000),
            new emp("Ivan", 45, "Male", "Sales", 60000),
            new emp("Judy", 35, "Female", "IT", 76000),
            new emp("Karl", 29, "Male", "Marketing", 72000),
            new emp("Leo", 27, "Male", "Marketing", 58000),
            new emp("Ali", 36, "Male", "IT", 75000)
    );

    public static void main(String[] args) {

        //1.employee filtering
        System.out.println("1.employee filtering");
        empList.stream().filter(emp -> emp.getAge()>30 && emp.getDepartment().equalsIgnoreCase("Sales")).forEach(System.out::println);

        //2.employee name length
        System.out.println("\n2.employee name length");
        empList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("IT") && emp.getName().length() >= 5 ).forEach(System.out::println);

        //3.Unique Department
        System.out.println("\n3.Unique Department");
        System.out.println(empList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet()));

        //4.Average salary by department
        System.out.println("\n4.Average salary by department");
        empList.stream().collect(Collectors.groupingBy(emp :: getDepartment,Collectors.averagingDouble(emp::getSalary)))
                .forEach((department , salary)-> System.out.println(department+": "+salary));


        //5.oldest Employee
        System.out.println("\n5.Oldest Employee");
        empList.stream().max(Comparator.comparing(emp -> emp.getAge())).ifPresent(System.out::println);

        //6.count by gender
        System.out.println("\n6.count by gender");
        empList.stream().collect(Collectors.groupingBy(emp -> emp.getGender(),Collectors.counting()))
                .forEach((gender,count)-> System.out.println(gender+": "+count));

        //7.concat Name
        System.out.println("\n7.Concat name");
        System.out.println(empList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("HR"))
                .map(emp -> emp.getName()).collect(Collectors.toList()));


        //8.salary raise
        System.out.println("\n8.Salary Raise");
        empList.stream().filter(emp -> emp.getDepartment().equalsIgnoreCase("Finance")).map(emp -> emp.getSalary()*1.10)
                .forEach(System.out::println);


        //9.Employee with minimun salary
        System.out.println("\n9.Employee with minimun salary");
        empList.stream().min(Comparator.comparing(emp -> emp.getSalary())).ifPresent(System.out::println);

        //10.Group employee by first letter
        System.out.println("\n10.Group employee by first letter");
        empList.stream().collect(Collectors.groupingBy(emp -> emp.getName().charAt(0),Collectors.counting()))
             .forEach((ch,count)-> System.out.println(ch+": "+count));
        //11.find all employee with same salary
        System.out.println("\n11.Find all employee with same salary");
        System.out.println(empList.stream().collect(Collectors.groupingBy(emp -> emp.getSalary())));

        //12.Sort employee
        System.out.println("\n12.Sort employee by age");
        empList.stream().sorted(Comparator.comparing(emp -> emp.getAge())).forEach(System.out::println);




    }
}
