package com.example.springboot.learning.basics.Example07;

public class info07 {
    public static int swapNum(int[] arr){
        int count =0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            if(arr[left]%2==0){
                int temp =arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                count++;
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }

        }
        int halfArray = arr.length/2-count;
        return Math.min(halfArray,count);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        System.out.println(swapNum(arr));
    }
}
