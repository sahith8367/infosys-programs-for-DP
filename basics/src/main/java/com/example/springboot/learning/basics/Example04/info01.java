package com.example.springboot.learning.basics.Example04;

// 02 . Sub array with given Sum;

//Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], target = 23
//Output: [2, 5]
//Explanation: Sum of subarray arr[2...5] is 2 + 4 + 8 + 9 = 23.
//
//Input: arr[] = [1, 10, 4, 0, 3, 5], target = 7
//Output: [3, 5]
//Explanation: Sum of subarray arr[3...5] is 4 + 0 + 3 = 7.
//
//Input: arr[] = [1, 4], target = 0
//Output: [-1]
//Explanation: There is no subarray with 0 sum.

import org.hibernate.annotations.Array;

import java.util.ArrayList;

public class info01 {
    public ArrayList<Integer> result(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==target){
                    ans.add(++i);
                    ans.add(++j);
                    return ans;
                }
            }
        }
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        info01 obj = new info01();
        System.out.println(obj.result(arr,target));
    }
}
