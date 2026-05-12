package com.example.springboot.learning.basics.Example05;

import java.util.HashMap;

public class info07 {
    public static int method1(String str){
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str ="statistics";
        System.out.println(method1(str));;
    }
}
