package com.learnJava.Blind75;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {


    public static int count_string(String str)
    {
        int max= 0;
        for (int i = 0; i < str.length() ; i++) {

            Set<Character> set = new HashSet<>();

            for (int j = i; j < str.length(); j++) {
              char c = str.charAt(j);
              if (set.contains(c))
                  break;
              set.add(c);

              max=Math.max(max,j-i+1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(count_string("pwwkew"));
    }


}
