package com.example.springboot.learning.basics.Example07;
import java.util.*;

public class info03 {
    public static int[] findPair(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int currSum = arr[left]+arr[right];
            if(currSum==target){
                return new int[]{arr[left],arr[right]};
            }else{
                if(currSum<target)
                    left++;
                if(currSum>target)
                    right--;
            }
        }return new int[]{};
    }
    public static void main(String[] args) {// Test Case 1
        int[] result1 = findPair(new int[]{1, 2, 3, 4, 6}, 6);
        System.out.println("Test 1: " + Arrays.toString(result1));

        // Test Case 2
        int[] result2 = findPair(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Test 2: " + Arrays.toString(result2));

        // Test Case 3
        int[] result3 = findPair(new int[]{1, 3, 4, 5, 8, 10}, 12);
        System.out.println("Test 3: " + Arrays.toString(result3));

        // Test Case 4
        int[] result4 = findPair(new int[]{-5, -2, 0, 3, 7}, 5);
        System.out.println("Test 4: " + Arrays.toString(result4));
    }
}
