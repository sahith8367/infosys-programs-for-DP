package com.example.springboot.learning.basics.Example04;

import java.util.ArrayList;
import java.util.Collections;

//Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
//Output: a[] = [2, 2, 3, 4], b[] = [7, 10]
//
//Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
//Output: a[] = [1, 2, 3, 5, 8, 9], b[] = [10, 13, 15, 20]
//
//Input: a[] = [0, 1], b[] = [2, 3]
//Output: a[] = [0, 1], b[] = [2, 3]
public class info03 {
    static void method( int n,int[] a,int m,int[] b){
        for(int i=m-1;i>=0;i--){
            int last = a[n-1];
            int j;
            for(j=n-2;j>=0&&b[i]<a[j];j--){
                a[j+1]=a[j];
            }
            if(last>b[i]){
                a[j+1]=b[i];
                b[i]=last;
            }
        }
        for(int i :a)
            System.out.print(i+" ");
        System.out.println();
        for(int i : b){
            System.out.print(i+ " ");
        }
    }
    static void method1(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: a)
            list.add(i);
        for(int i : b)
            list.add(i);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list1 =new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        for(int i=0;i<a.length;i++){
            list1.add(list.get(i));
        }
        for(int i=a.length;i<list.size();i++){
            list2.add(list.get(i));
        }
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void main(String[] args) {
        int[] a ={2, 4, 7, 10};
        int[] b = {2,3};
//        method1(a,b);
        method(a.length,a,b.length,b);

    }
}
