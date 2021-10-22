package com.company;

public class Main {

    public static void main(String[] args) {

        String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println(strStr(haystack1,needle1));

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println(strStr(haystack2,needle2));

        String haystack3 = "";
        String needle3 = "";
        System.out.println(strStr(haystack3,needle3));

    }

    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0){
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0; i < n - m ; i++){
            int j;
            for(j = 0; j < m; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            } if(j == m){
                return i;
            }
        }
        return -1;
    }
}
