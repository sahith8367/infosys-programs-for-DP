package com.example.springboot.learning.basics.Example07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class info02 {
    public static int findMajority1(int[] arr){
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }else{
                if(stack.peek()==arr[i]){
                    stack.push(arr[i]);
                }else{
                    stack.pop();
                }
            }
        }
        return stack.pop();
    }
    public static int findMajority(int[] arr){
        int count=0;
        int currNum =0;
        for(int num:arr){
            if(count==0){
                currNum=num;
                count++;
            } else {
                if(currNum==num){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return currNum;
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] test1 = {3, 2, 3};
        System.out.println("Test 1 Result: " + findMajority(test1)); // Expected: 3

        // Test Case 2
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test 2 Result: " + findMajority(test2)); // Expected: 2

        // Test Case 3
        int[] test3 = {1, 1, 1, 1, 2, 3, 4};
        System.out.println("Test 3 Result: " + findMajority(test3)); // Expected: 1

        // Test Case 4
        int[] test4 = {6, 5, 5};
        System.out.println("Test 4 Result: " + findMajority(test4)); // Expected: 5
    }
}
