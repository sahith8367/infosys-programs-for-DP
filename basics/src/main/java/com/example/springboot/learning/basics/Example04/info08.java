package com.example.springboot.learning.basics.Example04;

import java.util.Scanner;

public class info08 {

    // this is using memoization which is top down aproach
    public static int feb(int n,int[] memo){
        if(n<=1){
            memo[n]=n;
            return n;
        }
        return memo[n]=feb(n-1,memo)+feb(n-2,memo);
    }
    public static int feb2(int n){
        if(n<=1){
            return n;
        }
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter value : ");
        int n = scan.nextInt();
        int[] memo = new int[n+1] ;
        System.out.println(feb(n,memo));
        System.out.println(feb2(n));

    }
}
