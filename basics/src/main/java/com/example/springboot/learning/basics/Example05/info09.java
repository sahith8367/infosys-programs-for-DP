package com.example.springboot.learning.basics.Example05;

import java.util.ArrayList;
import java.util.Scanner;

//                 [0]
//                /   \
//             [4]     [1]
//               \     /
//               [3]-[2]
public class info09 {
    public static int method(int n,String[] array,int index,String target){
        for(int i=0;i<n;i++){
            if(array[i].equals(target)){
                int left = (i-index+5)%5;
                int right = (index-i+5)%5;
                return Math.min(left,right);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;        //        1
        String[] array = {"blue","green","yellow","red","black"};
        int index = 1;
        String str = "black";
        System.out.println(method(n,array,index,str));
        String target = array[index];
        int left=index;
        int right=index;
        int countRight=0,countLeft=0;
        int loop = n;
        while(loop!=0){
            if(left<0){
                left = n-1;
            }if(right==n)
                right = 0;
            if(array[left].equals(str)){
                System.out.println("left : "+countLeft++);
                break;
            }else if(array[right].equals(str)){
                System.out.println("right"+countRight++);
                break;
            }
            left--;
            ++countLeft;
            ++countRight;
            right++;
            loop--;
        }
    }
}
