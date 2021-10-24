package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};
        int[] nums3 = {};
        int[] nums4 = {-1};
        int[] nums5 = {0};

        System.out.println(summaryRanges(nums1)); //[0->2, 4->5, 7]
        System.out.println(summaryRanges(nums2)); //[0, 2->4, 6, 8->9]
        System.out.println(summaryRanges(nums3)); //[]
        System.out.println(summaryRanges(nums4)); //[-1]
        System.out.println(summaryRanges(nums5)); //[0]


    }
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return list;
        }

        for(int i = 0; i < nums.length; i++){
            int p = nums[i];
            while (i < nums.length-1 && nums[i]+1 == nums[i+1]){
                i++;
            }
            if(p != nums[i]){
                list.add(p + "->" + nums[i]);
            } else {
                list.add(p + "");
            }
        }
        return list;

    }
}
