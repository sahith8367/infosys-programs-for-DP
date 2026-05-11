package com.example.springboot.learning.basics.Example04;

import java.util.Scanner;

public class info10 {
    public static int lucusNum1(int n){
        int prev = 2;
        int curr = 1;
        if(n==1){
            return 2;
        }
        if(n==2){
            return 1;
        }
        return lucusNum1(n-1)+lucusNum1(n-2);
    }
    public static int lucusNum2(int n,int[] memo){
        if(n==1){
            return memo[n]=2;
        }if(n==2){
            return memo[n]=1;
        }if(memo[n]!=0){
            return memo[n];
        }
        return memo[n]=lucusNum2(n-1,memo)+lucusNum2(n-2,memo);
    }
    public static int lucusNum(int n){
        int[] dp = new int[n+1];
        if(n==1)
            return dp[n]=2;
        if(n==2)
            return dp[n]=1;
        for(int i=3;i<=n;i++){
            dp[n]=lucusNum(n-1)+lucusNum(n-2);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        System.out.println(lucusNum1(n));
        int[] memo = new int[n+1];
        System.out.println(lucusNum2(n,memo));
        System.out.println(lucusNum(n));
    }
}
