package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr4 = {2,3,4,2,2,3,5,7}; //4
        int[] arr5 = {4,6,2,4,3,8,6,2}; //3
        nonRepeatedInt(arr4);
        nonRepeatedInt(arr5);
    }
    public static int nonRepeatedInt (int[] arr)
    {

        int[] feq = new int[20];
        int result = 0;

        // count the frequency of the number in the list
        for (int i = 0; i < arr.length; i++)
        {
            feq[arr[i]]++;
        } //close for loop

        for (int i = 0; i < arr.length; i++)
        {
            if (feq[arr[i]] == 1)
            {
                result += arr[i];
                break;
            } //close if statement

        } //close for loop

        System.out.println(result);
        return result;

    }
}
