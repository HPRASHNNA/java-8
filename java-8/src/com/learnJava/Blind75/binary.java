package com.learnJava.Blind75;

public class binary {

    public static int binarysearch(int[] num,int target)
    {
        int left=0,right = num.length-1;
        while (left<right){
            int mid = left +(right-left)/2;
            if(num[mid]==target)
                return mid; 
            if(num[left]<=num[mid])
            {
                if(num[left] <= target && target<num[mid])
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(num[mid] < target && num[mid]<=num[right] ){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }


}
