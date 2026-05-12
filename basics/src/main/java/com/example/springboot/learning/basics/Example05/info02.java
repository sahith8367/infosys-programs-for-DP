package com.example.springboot.learning.basics.Example05;

public class info02 {
    public static int method(int n){
        int[] dp = new int[n+1];
        if(n<=1){
            return dp[n]=n;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=0;i<=n/2;i++){
            dp[2*i]=dp[i];
            dp[(2*i)+1]=dp[i]+dp[i+1];
        }
        for(int i:dp)
            System.out.println(i);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(method(n));
    }
}
