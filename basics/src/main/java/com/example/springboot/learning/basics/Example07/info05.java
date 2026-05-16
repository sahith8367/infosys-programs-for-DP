package com.example.springboot.learning.basics.Example07;

public class info05 {
    //Brute Froce
    public static int findMaxSumSubarray1(int[] arr,int k){
        int max = 0;

        int l = arr.length-k;
        for(int i=0;i<=l;i++){
            int currMax =0;
            for(int j=i;j<i+k;j++){
                currMax=currMax+arr[j];
            }
            max =Math.max(max,currMax);
        }
        return max;
    }
    public static int findMaxSumSubarray(int[] arr,int k){
        int max=0;
        int windowslide = 0;
        for(int i=0;i<k;i++){
            windowslide=windowslide+arr[i];
        }
        max= windowslide;
        for(int i=k;i<arr.length;i++){
            windowslide +=arr[i]-arr[i-k];
            max = Math.max(windowslide,max);
        }
        return max;
    }
    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Test 1: " + findMaxSumSubarray(new int[]{2, 1, 5, 1, 3, 2}, 3)); // Expected: 9

        // Test Case 2
        System.out.println("Test 2: " + findMaxSumSubarray(new int[]{2, 3, 4, 1, 5}, 2));    // Expected: 7

        // Test Case 3
        System.out.println("Test 3: " + findMaxSumSubarray(new int[]{1, 9, -1, -2, 7, 3}, 4)); // Expected: 13

        // Test Case 4
        System.out.println("Test 4: " + findMaxSumSubarray(new int[]{10, 20, 30, 40}, 2));   // Expected: 70
    }
}
