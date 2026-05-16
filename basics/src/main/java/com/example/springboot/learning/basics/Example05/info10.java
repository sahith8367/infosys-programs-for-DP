package com.example.springboot.learning.basics.Example05;

public class info10 {
    public int gcs(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int lcm(int a,int b){
        return Math.abs(a*b)/gcs(a,b);
    }
    public static void main(String[] args) {
        info10 obj=new info10();
        int[] num = {8,10,12,18,12,11,5,6,20};
        int result=num[0];
        for(int i=1;i<num.length;i++){
            result = obj.lcm(result,num[i]);
        }
        System.out.println(result);
    }
}
