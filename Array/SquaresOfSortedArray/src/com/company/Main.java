package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int nums1[] = {-4,-1,0,3,10};
        int nums2[] = {-7,-3,2,3,11};
        sortedSquares(nums1); //[0, 1, 9, 16, 100]
        sortedSquares(nums2); //[4, 9, 9, 49, 121]

    }
    public static int[] sortedSquares(int[] arr) {


        int[] output = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        int ind = arr.length-1;

        while (start <= end)
        {
            if(Math.abs(arr[start]) < Math.abs(arr[end]))
            {
                output[ind] = arr[end] * arr[end];
                end--;
            } else {
                output[ind] = arr[start] * arr[start];
                start ++;
            }
            ind--;
        }
        System.out.println(Arrays.toString(output));
        return output;


    }
}
