package com.learnJava.Blind75;

public class Rotated_Sorted_Array {


    public static int sortedarray(int [] num )
    {
        int left=0 , rigth = num.length-1;
        while (left<rigth)
        {
            int mid = left+(rigth-left)/2;

            if(num[mid]<num[rigth])
                rigth=mid;
            else
                left=mid+1;


        }
        System.out.println("rotation "+left);
        return num[left];
    }


    public static void main(String[] args) {
        int [] num = {3,4,5,1,2,};
        System.out.println(sortedarray(num));
    }
}
