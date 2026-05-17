package com.example.springboot.learning.basics.Example07;

import java.util.HashSet;
import java.util.Map;

public class info08 {
    public static void method(String str , int k){
        int count =0;
        for(int i=0;i<=str.length()-k;i++){
            int index = i;
            int innerCount =0;
            HashSet<Character> map = new HashSet<>();
            for(int j=0;j<k;j++){
                if(map.contains(str.charAt(index))){
                    break;
                }
                map.add(str.charAt(index++));
                innerCount++;
            }
            if(innerCount==k){
                count++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        String str = "abcdaaa";
        int k =3;
        method(str,k);
    }
}
