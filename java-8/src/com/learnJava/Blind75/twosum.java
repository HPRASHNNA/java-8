package com.learnJava.Blind75;

import java.util.HashMap;
import java.util.Map;

public class twosum {


    public static int[] bf_2sum(int[] num , int target)
    {
        for (int i = 0; i < num.length ; i++)
        {
            for(int j = i+1 ;j<num.length;j++)
            {
                if (num[i] + num[j]==target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }
    public static int[] op_2sum(int[] num , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int targetnum = target-num[i];
            if(map.containsKey(targetnum))
                return new int[]{map.get(targetnum),i};
            else
                map.put(num[i],i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] num = {2,7,11,15};

        int target= 9;
        int [] res = bf_2sum(num,target);
        for(int i: res)
        {
            System.out.println(i);
        }
    }
}
