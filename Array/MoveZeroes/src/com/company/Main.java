package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	// write your code here
        int[] nums1 = {0,1,0,3,12};
        int[] nums2 = {0};
        moveZeroes(nums1);
        moveZeroes(nums2);

    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        if(nums == null || nums.length == 0){
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;

        }
        System.out.println(Arrays.toString(nums));

    }
}
