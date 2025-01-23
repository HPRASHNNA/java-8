package com.learnJava.practice;

import com.learnJava.data.StudentDataBase;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumerpractice {

    public static void main() {
        List<String> element = Arrays.asList("Java", "JavaScript", "DSA", "C++");
        Consumer<List<String>> c1 = (list) -> System.out.println(list);
        Consumer<List<String>> c2 = (list) -> System.out.println(list.toString().toUpperCase());
        Consumer<List<String>> c3 = (list) -> {
            for(String name : list){
                if(name.startsWith("J"))
                    System.out.println(name);

            }
        };

        c3.accept(element);

        System.out.println("And then method ");

        c1.andThen(c2).accept(element);


    }



    public static void main1() {
        List<Integer> number = Arrays.asList(5,8,6,4,9,10);

        Consumer<List<Integer>> c1 = (list)->{
            for(Integer i : list){
                System.out.println(i*i);
            }
        };

        c1.accept(number);
    }

    public static void main(String[] args) {
        BiConsumer<Integer , Integer> add = (a,b)-> System.out.println(a+b);
        add.accept(5,7);
    }
}
