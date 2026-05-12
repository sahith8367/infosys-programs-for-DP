package com.example.springboot.learning.basics.Example05;

public class info03 {
    public static int method1(int[] num){
        int count =0;
        int left = 0;
        int right = num.length-1;
        while(left<=right){
            if(num[left]==num[right]){
                count++;
                left++;
            }else{
                count++;
                left++;
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,1};
        System.out.println(method1(num));
    }
}
