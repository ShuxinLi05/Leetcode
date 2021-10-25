package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,2,2,3};
        int[] nums2 = {2,3,1,3,2};
        int[] nums3 = {-1,1,-6,4,5,-6,1,4,1};
        System.out.println(Arrays.toString(frequencySort(nums1))); // [3, 1, 1, 2, 2, 2]
        System.out.println(Arrays.toString(frequencySort(nums2))); // [1, 3, 3, 2, 2]
        System.out.println(Arrays.toString(frequencySort(nums3))); // [5, -1, 4, 4, -6, -6, 1, 1, 1]

    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) -> {
            return (map.get(a) == map.get(b)) ? b - a : map.get(a) - map.get(b);
        });

        int[] result = new int[nums.length];
        int i = 0;
        for(int num : list){
            for(int j = 0; j < map.get(num); j++){
                result[i++] = num;
            }
        }
        return result;
    }
}
