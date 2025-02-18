package com.learnJava.Blind75;

public class Except  {


//bf
/*    public static void main(String[] args) {
        int[] num ={1,2,3,4};
        int product = 1;
        for (int i = 0; i < num.length; i++) {
         product*=num[i];

        }
        int ans[]= new int[num.length];
        for (int i = 0; i < num.length; i++) {
            ans[i]=product/num[i];
        }

        for(int i : ans)
            System.out.println(i);
    }
}*/

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int ans[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            int pro = 1;
            for (int j = 0; j < num.length; j++) {
                if(i==j)
                    continue;
                pro*=num[j];
            }
            ans[i]=pro;
        }
        for(int i : ans){
            System.out.println(i);
        }
    }
}

