package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;

        System.out.println(findKthLargest(nums1,k1)); //5
        System.out.println(findKthLargest(nums2,k2)); //4
    }

    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();

    }
}
