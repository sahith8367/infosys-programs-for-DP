package com.example.springboot.learning.basics.Example04;

public class info12 {
    //Using normal method
    public static int climbstairs(int n){
        if(n<=3){
            return n;
        }
        return climbstairs(n-1)+climbstairs(n-2)+climbstairs(n-3);
    }
    //using memoization
    public static int climbstairs1(int n,int[] memo){
        if(n<=3)
            return memo[n]=n;
        return memo[n]=climbstairs1(n-1,memo)+climbstairs1(n-2,memo)+climbstairs1(n-3,memo);
    }
    //Using Dp tabulation
    public static int climbstairs2(int n){
        int[] dp = new int[n+1];
        if(n<=3)
            return dp[n]=n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 10;
        while(n>=0){
            System.out.println("Normal method : "+climbstairs(n));
            int[] memo = new int[n+1];
            System.out.println("Memoiztion : "+climbstairs1(n,memo));
            System.out.println("Tabulization : "+climbstairs2(n));
            n--;
        }
    }
}
