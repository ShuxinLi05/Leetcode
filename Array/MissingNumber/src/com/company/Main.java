package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};
        int[] nums4 = {0};
        System.out.println(missingNumber(nums1)); //2
        System.out.println(missingNumber(nums2)); //2
        System.out.println(missingNumber(nums3)); //8
        System.out.println(missingNumber(nums4)); //1

    }

    public static int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int newCount = nums.length + 1;
        for(int i = 0; i < newCount; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
