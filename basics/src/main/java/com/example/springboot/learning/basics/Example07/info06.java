package com.example.springboot.learning.basics.Example07;

public class info06 {
    public static int tower(int[] width,int[] height,int k){
        int maxheight =0;
        for(int i=0;i<k-1;i++){
            int currHeight = 0;
            if(width[i]==width[i+1]){
                if(height[i]>height[i+1])
                    currHeight=currHeight+height[i];
                else
                    currHeight=currHeight+height[i+1];
            } else if (width[i]<width[i+1]) {
                currHeight=currHeight+height[i];
            }
            maxheight=Math.max(currHeight+maxheight,maxheight);
        }
        return maxheight;
    }
    public static void main(String[] args) {
        int k =4;
        int[] width ={10,10,20,20};
        int[] height ={5,15,20,20};
        System.out.println(tower(width,height,k));;
    }
}
