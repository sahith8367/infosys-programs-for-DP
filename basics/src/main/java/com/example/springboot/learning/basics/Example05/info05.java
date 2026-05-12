package com.example.springboot.learning.basics.Example05;

import java.util.ArrayList;
import java.util.Arrays;

public class info05 {
    public static int tringle(ArrayList<ArrayList<Integer>> list){
        int max =0;
        int l =list.size()-2;
        for(int i=l;i>=0;i--){
            int l2=list.get(i).size();
            for(int j=0;j<l2;j++){
                int node = list.get(i).get(j);
                int left = list.get(i+1).get(j);
                int right = list.get(i+1).get(j+1);
                int min = node+Math.min(left,right);
                list.get(i).set(j,min);
            }
        }
        return list.get(0).get(0);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(2)));
        list.add(new ArrayList<>(Arrays.asList(3,4)));
        list.add(new ArrayList<>(Arrays.asList(6,5,7)));
        list.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
        System.out.println(list);
        System.out.println(tringle(list));
    }
}
