package com.example.springboot.learning.basics.Example07;

import java.util.*;

class info10{

    /**
     * Core logic to solve the auction revenue problem.
     */
    public static long solve(int n, int m, int[] b, int[][] bid) {
        int totalRevenue = 0;
        boolean[] visited = new boolean[m];
        for(int i=0;i<n;i++){
            int currRevenue = -1;
            int index = -1;
            for(int j=0;j<m;j++){
                if (!visited[j] && bid[j][i]<=b[j]){
                    if(bid[j][i]>currRevenue){
                        currRevenue=bid[j][i];
                        index = j;
                    }
                }
            }
            if(currRevenue!=-1){
                totalRevenue+=currRevenue;
                visited[index]=true;
            }
        }
        return totalRevenue;
    }

    public static void main(String[] args) {
        System.out.println("--- Running Test Cases ---");
        // Test Case 1: Standard logic (Highest bidder wins)
        runTest(1, 2, 2,
                new int[]{100, 100},
                new int[][]{{50, 10}, {20, 60}},
                110);

        // Test Case 2: Budget Constraint (Highest bid rejected if > budget)
        runTest(2, 1, 2,
                new int[]{50, 100},
                new int[][]{{80}, {70}},
                70);

        // Test Case 3: More Items than Bidders (Revenue stops once bidders run out)
        runTest(3, 3, 2,
                new int[]{500, 500},
                new int[][]{{100, 10, 10}, {50, 200, 10}},
                300);

        // Test Case 4: Tie-Breaking (Lower index wins on equal bids)
        runTest(4, 1, 2,
                new int[]{100, 100},
                new int[][]{{50}, {50}},
                50);

        // Test Case 5: Out of Budget (No one can afford the items)
        runTest(5, 2, 1,
                new int[]{10},
                new int[][]{{100, 100}},
                0);
    }

    /**
     * Helper method to format and display test results
     */
    private static void runTest(int id, int n, int m, int[] b, int[][] bid, long expected) {
        long result = solve(n, m, b, bid);
        String status = (result == expected) ? "PASSED ✅" : "FAILED ❌";
        System.out.printf("Test %d: %s | Expected: %d, Got: %d%n", id, status, expected, result);
    }
}