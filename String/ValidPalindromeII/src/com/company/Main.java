package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "aba";
        String s2 = "abca";
        String s3 = "abc";
        System.out.println(validPalindrome(s1)); // true
        System.out.println(validPalindrome(s2)); // true
        System.out.println(validPalindrome(s3)); // false

    }
    public static boolean validPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while (left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left+1, right) || isPalindrome(s, left,right-1);
            }
            left++;
            right--;
        }
        return true;

    }

    public static boolean isPalindrome(String s, int i, int j){

        int left = i;
        int right = j;

        while (left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
