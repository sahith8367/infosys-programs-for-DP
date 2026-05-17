package com.example.springboot.learning.basics.Example07;

public class info09 {
    public static void method(int[] arr,int l,int target){
        int[] dp=new int[target+1];
        for(int i=0;i<l;i++){
            if(target>=arr[i]){
                dp[arr[i]]=Math.max(dp[arr[i]]+dp[target-arr[i]],dp[arr[i]]);
            }
        }
        System.out.println(dp[target]);
    }
    public static void main(String[] args) {
        int l = 3;
        int[] arr = {9,10,1};
        int target = 11;
        method(arr,l,target);
    }
}
