package Question;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class exercise {

    static List<employee> employees = Arrays.asList(
            new employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
            new employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
    );

    public static void main(String[] args) {
        // 1.print employee name start with 'A'
        System.out.println("1.Start With A");
        employees.stream().filter(emp -> emp.getName().startsWith("A")).forEach(System.out::println);

        // 2.Group the employees By department name
        System.out.println("\n2.Group By Department name");
        employees.stream().collect(groupingBy(emp->emp.getDepartNames()))
                .forEach((departName,employees)-> System.out.println(departName+" "+employees));

        // 3. Group by the department count of the employee
        System.out.println("\n3.Count Of Employee in each Department");
        employees.stream().collect(groupingBy(emp->emp.getDepartNames(), counting()))
                .forEach((departName,count)-> System.out.println(departName+" "+count));

        // 4.Group by the department name and employee name
        System.out.println("\n4.Employee in each department");
        employees.stream().collect(groupingBy(employee::getDepartNames, mapping(employee::getName, toList())))
                .forEach((departName, names) -> System.out.println(departName + ": " + names));

        // 5. Sum of each department
        System.out.println("\n5.Sum of salary in each department");
        employees.stream().collect(groupingBy(employee ::getDepartNames, summingDouble(emp->emp.getSalary())))
                .forEach((departName,Salary)-> System.out.println(departName+" "+Salary));


        // 6.Number of male and female in each department
        System.out.println("\n6.Number of male and female in each department");
        employees.stream().collect(groupingBy(employee::getDepartNames, partitioningBy(employee -> employee.getGender().equals("Male")
                , counting()))).forEach((departName, genderCount) ->
                    {
                        Long maleCount = genderCount.get(true);
                        Long femaleCount = genderCount.get(false);
                        System.out.println(departName + ": Male count = " + maleCount + " | Female count = " + femaleCount);
                    });

        // 7. find the total count of employee
        System.out.println("\n7.Total count of employee");
        System.out.println("The total count : "+employees.stream().count());

        // 8. max age of the employee
        System.out.println("\n8.max age of employee");
        System.out.println(employees.stream().map(employee :: getAge).max(Integer::compareTo));

        // 9. all department name
        System.out.println("\n9.Print All department Name");
        System.out.println(employees.stream().map(employee ::getDepartNames).collect(toSet()));


        // 10. Group by the department count of the employee
        System.out.println("\n10.Count Of Employee in each Department");
        employees.stream().collect(groupingBy(emp->emp.getDepartNames(), counting()))
                .forEach((departName,count)-> System.out.println(departName+" "+count));


        // 11. list of employee whose age less than 30
        System.out.println("\n11.Employee whose age less than 30");
        employees.stream().filter(employee -> employee.getAge()<30).forEach(System.out::println);

        // 12.list of employee whose age between 26 and 31
        System.out.println("\n12.Employee whose age between 26 and 31");
        employees.stream().filter(employee -> employee.getAge()<31 && employee.getAge()>26).forEach(System.out::println);

        // 13. Average age of male and female
        System.out.println("\n13.Average age of male and female");
        employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender(),Collectors.averagingInt(employee::getAge)))
                .forEach((gender,avgage)-> System.out.println(gender+"  "+ avgage));

        // 14. count of male and female
        System.out.println("\n14.Count of male and female");
        employees.stream().collect(Collectors.groupingBy(employee -> employee.getGender(),Collectors.counting()))
                .forEach((gender,count)-> System.out.println(gender+": "+count));

        // 15. Find the department which have max number of employee
        System.out.println("\n15.Print the  department which have max number employee");
        System.out.println(employees.stream().collect(groupingBy(employee -> employee.getDepartNames(), counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null));

        // 16.Find the average salary in all department
        System.out.println("\n16.Average salary in all department");
        System.out.println(employees.stream().collect(averagingDouble(employee::getSalary)));

        // 17.highest salary in each department
        System.out.println("\n17.Highest salary in each department");
        employees.stream().collect(Collectors.groupingBy(employee -> employee.getDepartNames(),Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))))
                .forEach((departName ,salary)-> System.out.println(departName+": "+salary));

        // 18.Find the list of employee and sort them by their salary
        System.out.println("\n18.list of employee and sort them by their salary");
        employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).forEach(System.out::println);


        // 19.Get second lowest salary
        System.out.println("\n19.Get the second lowest salary");
        System.out.println(employees.stream().sorted(Comparator.comparing(employee -> employee.getSalary())).skip(1).findFirst().get());

    }
}
