package com.example.springboot.learning.basics.Example04;

import java.util.Arrays;
import java.util.Comparator;

class Items{
    int values;
    int weights;
    public Items(int values,int weights){
        this.values = values;
        this.weights = weights;
    }
}
public class info06 {
    public static void main(String[] args) {
        Items[] item = new Items[3];
        item[0] = new Items(3,3);
        item[1] = new Items(2,2);
        item[2] = new Items(1,1);
        Arrays.sort(item, Comparator.comparing(obj->obj.weights));
        for(Items i : item){
            System.out.println(i.values + " "+i.weights);
        }
    }
}
