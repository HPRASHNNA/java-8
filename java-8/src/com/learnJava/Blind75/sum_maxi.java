package com.learnJava.Blind75;

public class sum_maxi {

    /*public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
            max=Math.max(sum,max);
        }
        System.out.println(sum);
    }*/


    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        int curr = num[0];
        int max = num[0];
        for (int i = 1 ; i < num.length; i++) {
            curr=Math.max(num[i],curr+num[i]);
            max=Math.max(max,curr);
        }
        System.out.println(max);
    }
}
