package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int arr1[] = {1,2,3,2};
        int arr2[] = {1,1,1,1,1};
        int arr3[] = {1,2,3,4,5};
        System.out.println(sumOfUniqueNums(arr1)); //4
        System.out.println(sumOfUniqueNums(arr2)); //0
        System.out.println(sumOfUniqueNums(arr3)); //15

    }

    private static int sumOfUniqueNums(int[] arr)
    {
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) == 1){
                result += arr[i];
            } else if(map.get(arr[i]) == 2){
                result -= arr[i];
            }
        }
        return result;
    }
}
