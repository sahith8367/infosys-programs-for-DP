package com.example.springboot.learning.basics.Example05;

import java.util.Arrays;

public class info01 {
    public static String method1(char num ,String str){
        int max = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==num){
                String temp = str.substring(0,i)+str.substring(i+1);
                int currMax = Integer.parseInt(temp);
                if(currMax>max){
                    max= currMax;
                }
            }
        }
        return String.valueOf(max);
    }
    public static String method2(char val , String str1){
        int max = 0;
        for(int i =0;i<str1.length();i++){
            if(str1.charAt(i)==val){
                String temp = str1.substring(0,i)+str1.substring(i+1);
                int cur = Integer.parseInt(temp);
                if(cur>max){
                    max=cur;
                }
            }
        }
        return String.valueOf(max);
    }
    public static void main(String[] args) {
        String s = "13214";
        char i ='1';
        System.out.println(method1(i,s));
        System.out.println(method2(i,s));
    }
}
