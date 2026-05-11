package com.example.springboot.learning.basics.Example04;

import java.util.Scanner;

public class info09 {
    public static int triofeb1(int n,int[] memo){
        if(n<=2){
            return 0;
        }

        memo[3]=1;
        if(memo[n]!=0){
            return memo[n];
        }
        return memo[n]=triofeb1(n-1,memo)+triofeb1(n-2,memo)+triofeb1(n-3,memo);
    }
    public static int triofeb2(int n){
        int[] dp = new int[n+1];
        if(n<=2){
            return 0;
        }
        dp[3]=1;
        for(int i=4;i<=n;i++){
            dp[n] = triofeb2(n-1)+triofeb2(n-2)+triofeb2(n-3);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int[] memo = new int[n+1];
        System.out.println(triofeb1(n,memo));
        System.out.println(triofeb2(n));

    }
}
