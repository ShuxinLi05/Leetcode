package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = {1,2,1};
        int[] nums2 = {1,3,2,1};
        getConcatenation(nums1);
        getConcatenation(nums2);

    }

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++)
        {
            ans[i] = ans[i + nums.length] = nums[i];

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

}
