package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = {0,2,1,5,3,4};
        int[] nums2 = {5,0,1,2,3,4};
        buildArray(nums1);
        buildArray(nums2);


    }

    public static int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for( int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
