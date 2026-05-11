package com.example.springboot.learning.basics.Example04;

import java.lang.reflect.Array;
import java.util.ArrayList;
// 01 . Count frequency in array
import java.util.HashMap;

//Input:  arr[] = [10, 20, 10, 5, 20]
//Output: [[5, 1], [10, 2], [20, 2]]
//Explanation: Here 5 occurs once, 10 occurs 2 times and 20 occurs 2 times.
//
//        Input: arr[] = [10, 20, 20]
//Output: [[10, 1], [20, 2]]
//Explanation: Here 10 occurs 1 time, 20 occurs 2 times.
public class info02 {

    public static ArrayList<ArrayList<Integer>> method(int n,int[] arr){

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int val =arr[i];
            int count=0;
            for(int j=i;j<n;j++){
                if(val==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(val);
            list.add(count);
            ans.add(list);
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> method1(int n , int[] arr){
        ArrayList<ArrayList<Integer>>  ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count= 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            list.add(count);
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,10,5,20};
        int n = arr.length;
        System.out.println(method1(n,arr));
    }
}
