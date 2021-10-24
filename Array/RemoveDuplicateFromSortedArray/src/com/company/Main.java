package com.company;

import java.util.ArrayList;
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
            return nums.length;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if(nums[j]!= nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}

