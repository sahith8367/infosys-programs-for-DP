package com.example.springboot.learning.basics.Example04;

public class info11 {
    // Normal method
    public static int climbingStairs1(int n){
        if(n<=1)
            return n;
        if(n==2)
            return n;
        return climbingStairs1(n-1)+climbingStairs1(n-2);
    }
    //Using memo
    public static int climbingStairs2(int n,int[] memo){
        if(n<=1)
            return n;
        if(n==2){
            return n;
        }
        return memo[n] = climbingStairs2(n-1,memo)+climbingStairs2(n-2,memo);
    }
    // Using DP tabulation
    public static int climbingStairs3(int n){
        int[] dp = new int[n+1];
        if(n<=1)
            return n;
        if(n==2)
            return n;
        dp[1]=1;
        dp[2]=2;
        if(dp[n]!=0)
            return dp[n];
        for(int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;
        while(n>=0){
        System.out.println(climbingStairs1(n));
        int[] memo = new int[n+1];
        System.out.println(climbingStairs2(n,memo));
            System.out.println(climbingStairs3(n));
        n--;}
    }
}
