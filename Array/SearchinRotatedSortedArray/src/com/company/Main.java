package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(search(nums1,target1));
        System.out.println(search(nums2,target2));
        System.out.println(search(nums3,target3));

    }
    public static int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while(start + 1 < end){
            int midpt = start + (end - start)/2;
            if(nums[midpt] == target){
                return midpt;
            }

            if(nums[start] <= nums[midpt]){
                if(nums[start] <= target && target <= nums[midpt]){
                    end = midpt;
                }else{
                    start = midpt;
                }

            }else{
                if(nums[midpt] <= target && target <= nums[end]){
                    start = midpt;
                }else{
                    end = midpt;
                }
            }
        }

        if(nums[start] == target){
            return start;
        }else if(nums[end] == target){
            return end;
        }else{
            return -1;
        }
    }
}
