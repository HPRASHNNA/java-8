package com.learnJava.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class exercise2 {


    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        System.out.println("1. sum of all elements");
        System.out.println(number.stream().mapToInt(Integer::intValue).sum());

        System.out.println("\n2. maxi element");
        number.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);

        System.out.println("\n3. fillter even number in list");
        number.stream().filter(num->num%2==0).forEach(System.out::println);

        System.out.println("\n4. how to many a present each word");
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        strings.stream().collect(Collectors.groupingBy(str->str.contains(String.valueOf('a')),Collectors.counting()))
                .forEach((string,count)-> System.out.println(string+" "+count));

        System.out.println("\n5. number of a in each word");
        strings.stream().collect(Collectors.toMap(str->str,str->str.chars().filter(ch->ch=='a').count()))
                .forEach((word,count)-> System.out.println(word+": "+count));

        System.out.println("\n6. average of number");
        System.out.println(number.stream().mapToInt(num->num).average());

        System.out.println("\n7. joining all the word");
        System.out.println(strings.stream().collect(Collectors.joining()));

    }
}
