package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;

    }
}
