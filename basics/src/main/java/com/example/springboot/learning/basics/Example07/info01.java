package com.example.springboot.learning.basics.Example07;

import java.util.Arrays;

public class info01 {
    public static boolean canAttendMeetings(int[][] interval){
        Arrays.sort(interval,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=1;i<interval.length;i++){
            int time2 = interval[i][1];
            int time1 = interval[i-1][1];
            if(time1>time2)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // Test Case 1
        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println("Test Case 1: " + canAttendMeetings(intervals1)); // Expected: false

        // Test Case 2
        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println("Test Case 2: " + canAttendMeetings(intervals2)); // Expected: true

        // Test Case 3
        int[][] intervals3 = {{5, 8}, {8, 10}};
        System.out.println("Test Case 3: " + canAttendMeetings(intervals3)); // Expected: true
    }
}
