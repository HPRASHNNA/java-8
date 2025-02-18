package com.learnJava.Blind75;

public class MostWater {

    public static int mostwater(int[] num)
    {
        int left=0,rigth=num.length-1,maxarea=0;
        while(left<rigth)
        {
            int heigth=Math.min(num[left],num[rigth]);
            int width=rigth-left;
            maxarea=Math.max(maxarea,heigth*width);
            if (num[left]<num[rigth])
                left++;
            else
                rigth--;

        }
        return maxarea;
    }

    public static void main(String[] args) {
      int[] num = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostwater(num));
    }
}
