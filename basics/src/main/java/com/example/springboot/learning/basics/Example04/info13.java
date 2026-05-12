package com.example.springboot.learning.basics.Example04;

public class info13 {

    static int minCostRecur(int i, int[] cost) {

        // Base case
        System.out.println(cost[i]);
        if (i == 0 || i == 1) {
            return cost[i];
        }
        System.out.println(cost[i] + Math.min(minCostRecur(i - 1, cost),
                minCostRecur(i - 2, cost)));
        return cost[i] + Math.min(minCostRecur(i - 1, cost),
                minCostRecur(i - 2, cost));
    }

    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        if (n == 1) return cost[0];

        // Return minimum of cost to
        // reach (n-1)th stair and
        // cost to reach (n-2)th stair  4
        return Math.min(minCostRecur(n - 1, cost),
                minCostRecur(n - 2, cost));
    }

    public static void main(String[] args) {
        int[] cost = { 16, 19, 10, 12, 18 };
        System.out.println(minCostClimbingStairs(cost));
    }
}