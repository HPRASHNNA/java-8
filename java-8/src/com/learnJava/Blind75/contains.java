package com.learnJava.Blind75;

import java.util.HashSet;

public class contains {

    public static  boolean duuplication(int []num)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length ; i++) {

            if (set.contains( num[i]))
                return true;
            set.add(num[i]);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] num = {8,7,11,15,8};
        System.out.println(duuplication(num));
    }



}



