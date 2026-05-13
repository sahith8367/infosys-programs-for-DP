package com.example.springboot.learning.basics.Example04;

public class info05 {

        public static int solveKnapsack(int W, int[] weights, int[] values, int n) {
            int[][] dp = new int[n+1][W+1];
            for(int i=1;i<=n;i++){
                for(int w=1;w<=W;w++){
                    if(w>=weights[i-1]){
                        dp[i][w]=Math.max(values[i-1]+dp[i-1][w-weights[i-1]],dp[i-1][w]);
                    }
                }
            }
            return dp[n][W];
        }

        public static void main(String[] args) {
            // Test Case 1: Standard case
            int[] v1 = {60, 100, 120};
            int[] w1 = {10, 20, 30};
            int W1 = 50;
            System.out.println("Test 1 (Standard): " + solveKnapsack(W1, w1, v1, v1.length)); // Expected: 220

            // Test Case 2: All items too heavy for capacity
            int[] v2 = {10, 20};
            int[] w2 = {10, 10};
            int W2 = 5;
            System.out.println("Test 2 (Too Heavy): " + solveKnapsack(W2, w2, v2, v2.length)); // Expected: 0

            // Test Case 3: Bag capacity is 0
            int[] v3 = {10, 20, 30};
            int[] w3 = {1, 2, 3};
            int W3 = 0;
            System.out.println("Test 3 (Zero Capacity): " + solveKnapsack(W3, w3, v3, v3.length)); // Expected: 0

            // Test Case 4: Single digit inputs (Easy to trace)
            int[] v4 = {2, 4, 7};
            int[] w4 = {1, 3, 5};
            int W4 = 8;
            System.out.println("Test 4 (Single Digits): " + solveKnapsack(W4, w4, v4, v4.length)); // Expected: 11

            // Test Case 5: Only one item can fit
            int[] v5 = {10, 50, 10};
            int[] w5 = {5, 10, 5};
            int W5 = 10;
            System.out.println("Test 5 (One Best Item): " + solveKnapsack(W5, w5, v5, v5.length)); // Expected: 50
        }

}
