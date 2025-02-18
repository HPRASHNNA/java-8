package com.learnJava.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;

public class threeSum {


    public static List<List<Integer>> sum (int num[]){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length-2; i++) {
            if(i>0 && num[i] == num[i-1]) continue;
            int left= i+1 , rigth = num.length-1;
            while(left<rigth)
            {
                int sum = num[i]+num[left]+num[rigth];
                if(sum == 0)
                {
                    res.add(Arrays.asList(num[i],num[left],num[rigth]));
                    while(left<rigth && num[left]==num[left+1])
                        left++;
                    while(left<rigth & num[rigth]==num[rigth-1])
                        rigth--;
                    left++;
                    rigth--;
                } else if (sum < 0 ) {
                    left++;
                }
                else {
                    rigth--;
                }
            }
        }


        return res;

    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Started");
       List <List<Integer>> result = sum(nums);
        System.out.println("3Sum Triplets (Two-Pointer): " + result);
    }
}
