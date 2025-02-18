package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static com.learnJava.data.StudentDataBase.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        return studentActivities;

    }

    public static List<String> printUniqueStudentActivities() {

        List<String> studentActivities = getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;

    }

    public static long getStudentActivitiesCount() {

        long totalActivities = getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;

    }




    public static List<String> getname() {

        List<String> studentActivities = getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

        return studentActivities;
    }
    public static void main(String[] args) {


        System.out.println("Student Activities : " + printStudentActivities());
        System.out.println("Unique Student Activities : " + printUniqueStudentActivities());
        System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());

    }

}
