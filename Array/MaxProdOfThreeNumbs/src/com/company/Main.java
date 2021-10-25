package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {-1,-2,-3};
        System.out.println(maximumProduct(nums1));
        System.out.println(maximumProduct(nums2));
        System.out.println(maximumProduct(nums3));
    }
    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        return Math.max(nums[0]*nums[1]*nums[nums.length-1],
                nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);

    }

}
