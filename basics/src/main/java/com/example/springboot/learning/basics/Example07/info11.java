package com.example.springboot.learning.basics.Example07;

import java.util.*;

public class info11 {

    /**
     * core logic to find the maximum profit based on switching states.
     * @param n Number of elements
     * @param b Switching modifier (bonus/penalty)
     * @param values The sequence of integers
     * @return Maximum achievable profit
     */
    public static long solve(int n, int b, int[] values) {
        long negInf = -1_000_000_000_000_000L;
        long pos = negInf;
        long neg = negInf;

        for (int x : values) {
            if (x > 0) {
                long np = Math.max(pos, (long) x);
                if (neg != negInf) {
                    np = Math.max(np, neg + x + b);
                }
                pos = np;
            } else {
                long nn = Math.max(neg, (long) x);
                if (pos != negInf) {
                    nn = Math.max(nn, pos + x + b);
                }
                neg = nn;
            }
        }

        // Return the best found, but never less than 0
        return Math.max(0, Math.max(pos, neg));
    }

    public static void main(String[] args) {
        System.out.println("--- Executing Test Cases ---");

        // Test 1: Simple Positive Gain
        runTest(1, 1, 10, new int[]{5}, 5);

        // Test 2: The Switching Bonus
        runTest(2, 2, 50, new int[]{-10, 10}, 50);

        // Test 3: High Switching Penalty (Cost)
        runTest(3, 2, -100, new int[]{20, -5}, 20);

        // Test 4: Zig-Zag Accumulator (Back and forth)
        runTest(4, 3, 20, new int[]{10, -5, 15}, 60);

        // Test 5: All Values Negative
        runTest(5, 3, 5, new int[]{-10, -20, -30}, 0);
    }

    /**
     * Helper to print test results clearly
     */
    private static void runTest(int id, int n, int b, int[] values, long expected) {
        long result = solve(n, b, values);
        String status = (result == expected) ? "PASSED ✅" : "FAILED ❌";
        System.out.printf("Test %d: %s | Expected: %d, Got: %d%n", id, status, expected, result);
    }
}