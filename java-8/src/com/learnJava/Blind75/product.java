package com.learnJava.Blind75;

public class product {
    public static void main(String[] args) {
        int[] num = {2,3,-2,4};
        int maxproduct=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int curr= 1;
            for (int j = 0; j <num.length ; j++) {
                curr*=num[j];
                maxproduct=Math.max(maxproduct,curr);
            }
        }
        System.out.println(maxproduct);
    }


}
