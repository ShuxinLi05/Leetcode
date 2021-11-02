package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] interval1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] interval2 = {{1,4},{4,5}};

        System.out.println(merge(interval1));
        System.out.println(merge(interval2));
    }

    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return intervals;

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0])); //a[0]-b[0]从小到大
        int[] curr = intervals[0];

        for(int i=1;i< intervals.length;i++){
            if(intervals[i][0]>curr[1]){
                result.add(curr);
                curr = intervals[i];
            } else {
                curr[1] = Math.max(curr[1],intervals[i][1]);
            }
        }
        result.add(curr);
        return result.toArray(new int[result.size()][2]);
    }
}
