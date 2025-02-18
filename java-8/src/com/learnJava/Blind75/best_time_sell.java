package com.learnJava.Blind75;

public class best_time_sell {
    public static int bestint (int[] num)
    {
        int maxprofite=0;
        int minprice=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i]<minprice)
                minprice=num[i];
            if(num[i]-minprice>maxprofite)
                maxprofite=num[i]-minprice;
        }
        return maxprofite;
    }

    public static void main(String[] args) {
        int[] num = {8,7,11,15};
        System.out.println(bestint(num));
    }
}
