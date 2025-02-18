package com.learnJava.Blind75;

import java.util.HashMap;
import java.util.HashSet;

public class vaild_anagram {

   /* public static Boolean freq(String str , String a)
    {
        int[] freqa = new int[58]; // 58 to account for both uppercase and lowercase letters

        // Fill frequency array for characters in `t`
        for (char c : str.toCharArray()) {
            freqa[c - 'A']++;
        }

        int[] freqb = new int[58]; // 58 to account for both uppercase and lowercase letters

        // Fill frequency array for characters in `t`
        for (char c : a.toCharArray()) {
            freqb[c - 'A']++;
        }

        return  false;
    }*/


    public static boolean freq(String str , String t)
    {
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i = 0 ; i <t.length();i++){
            char ch=t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else
                {
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }

        return map.isEmpty();

    }


    public static void main(String[] args) {
        String a="anagram" , r="nagaram";

        System.out.println(freq(a,r));
    }
}
