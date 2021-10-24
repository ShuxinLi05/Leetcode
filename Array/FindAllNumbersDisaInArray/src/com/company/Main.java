package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {4,3,2,7,8,2,3,1};
        int[] nums2 = {1,1};

        System.out.println(findDisappearedNumbers(nums1)); //[5,6]
        System.out.println(findDisappearedNumbers(nums2)); //[2]

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], true);
        }

        for (int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}
