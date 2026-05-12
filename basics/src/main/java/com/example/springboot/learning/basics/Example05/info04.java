package com.example.springboot.learning.basics.Example05;

public class info04 {
    public static int method1(int n,int exp,int[] mexp,int[] bonous){
        int ans=0;
        for(int i=0;i<n;i++){
            if(exp>=mexp[i]){
                ans++;
                exp=exp+bonous[i];
            }else{
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n =2;
        int exp = 128;
        int[] mexp = {78,130};
        int[] bonous = {10,0};
        System.out.println(method1(n,exp,mexp,bonous));
    }
}
