package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,1,2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums1)); //output 2
        System.out.println(removeDuplicates(nums2)); //output 5

    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++){
            if(nums[p2]!= nums[p1]){
                p1++;
                nums[p1] = nums[p2];
            }
        }
        return p1 + 1;
    }

}
