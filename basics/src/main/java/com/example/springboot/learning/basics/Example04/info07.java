package com.example.springboot.learning.basics.Example04;

public class info07 {
    public static int method(int find,int[] arr){
        int left=0,right=arr.length-1;
        int index =0;
        while(left!=right--){
            if(find==arr[left]){
                return left;
            }else if(find==arr[right]){
                return right;
            }
            left++;
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] arr ={2,6,3,9,6,12,4,7};
        int find = 6;
        System.out.println("index is : "+method(find,arr));
    }
}
