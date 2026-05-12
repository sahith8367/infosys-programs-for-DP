package com.example.springboot.learning.basics.Example05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class info08 {
    public static void method1(ArrayList<ArrayList<Integer>> list){
        int l = list.size()-2;
        for(int i=l;i>=0;i--){
            int l2 = list.get(i).size();
            for(int j=0;j<l2;j++){
                list.get(i).set(j,list.get(i).get(j)+Math.min(list.get(i+1).get(j),list.get(i+1).get(j+1)));
            }
        }
        System.out.println(list.get(0).get(0));
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(2)));
        list.add(new ArrayList<>(Arrays.asList(3,4)));
        list.add(new ArrayList<>(Arrays.asList(6,5,7)));
        list.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
        System.out.println(list);
        method1(list);
    }
}
