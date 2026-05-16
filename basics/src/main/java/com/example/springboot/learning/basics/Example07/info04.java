package com.example.springboot.learning.basics.Example07;

import java.util.Arrays;

public class info04 {
    static class item{
        int value;
        int weigth;
        double ratio;
        public item(int value,int weigth){
            this.value=value;
            this.weigth=weigth;
            this.ratio=(double) value/weigth;
        }
    }
    public static double getMaxValue(int[] value,int[] weight,int W){
        double currTotal =0.0;
        item[] items = new item[value.length];
        for(int i=0;i<value.length;i++){
            items[i] = new item(value[i],weight[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        for(item item : items){
            if(item.weigth<W){
                currTotal=currTotal+item.value;
                W=W-item.weigth;
            }else{
                currTotal=currTotal+item.ratio*W;
                return currTotal;
            }
        }
        return currTotal;
    }
    public static void main(String[] args) {
        // Test Case 1: Standard case with fractional remainder
        System.out.printf("Test 1 Result: %.2f (Expected: 240.00)\n",
                getMaxValue(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));

        // Test Case 2: Single item, capacity smaller than weight
        System.out.printf("Test 2 Result: %.2f (Expected: 166.67)\n",
                getMaxValue(new int[]{500}, new int[]{30}, 10));

        // Test Case 3: Multiple items, some with same ratio
        // Ratios: 40/4=10, 30/3=10, 10/5=2. Capacity 10.
        // Takes Item(40,4) and Item(30,3) [Total 7, Value 70]. 3 left.
        // Takes 3/5 of Item(10,5) [Value 6]. Total: 76.
        System.out.printf("Test 3 Result: %.2f (Expected: 76.00)\n",
                getMaxValue(new int[]{10, 40, 30}, new int[]{5, 4, 3}, 10));

        // Test Case 4: Capacity larger than total weight
        System.out.printf("Test 4 Result: %.2f (Expected: 160.00)\n",
                getMaxValue(new int[]{100, 60}, new int[]{20, 10}, 100));

        // Test Case 5: Very small capacity
        System.out.printf("Test 5 Result: %.2f (Expected: 10.00)\n",
                getMaxValue(new int[]{20, 100}, new int[]{10, 50}, 5));
    }
}
