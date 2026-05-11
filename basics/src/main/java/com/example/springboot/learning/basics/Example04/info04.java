package com.example.springboot.learning.basics.Example04;

public class info04 {
    public static int method(int[] arr,int n){
        int currSum = 0;
        int maxSum = 0;
        for(int i=0;i<n;i++){
            currSum = Math.max(currSum+arr[i],arr[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
//    nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6
public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    int n = nums.length;
    System.out.println(method(nums,n));
}
}
