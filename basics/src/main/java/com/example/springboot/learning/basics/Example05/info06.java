package com.example.springboot.learning.basics.Example05;

import java.util.ArrayList;

public class info06 {
    public static String method1(int n,ArrayList<String[]> list){
        int max=0;
        for(int i=0;i<list.size();i++){
            int a=Integer.parseInt(list.get(i)[0],2);
            int b =Integer.parseInt(list.get(i)[1],2);
            max = Math.max(max,a+b);
        }
        System.out.println(max);
        return Integer.toBinaryString(max);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<String[]> list =new ArrayList();
        list.add(new String[]{"101","100"});
        list.add(new String[]{"110","10"});
        list.add(new String[]{"1000","11"});
        System.out.println(method1(n,list));
    }
}
