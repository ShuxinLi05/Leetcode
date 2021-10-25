package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "00110011";
        String s2 = "10101";
        System.out.println(countBinarySubstrings(s1)); //6
        System.out.println(countBinarySubstrings(s2)); //4

    }
    public static int countBinarySubstrings(String s) {
        int count = 0, i = 1, previous = 0, current = 1;
        while (i < s.length()){
            if(s.charAt(i-1) != s.charAt(i)){
                count += Math.min(previous, current);
                previous = current;
                current = 1;
            } else {
                current ++;
            }
            i++;
        }
        return count += Math.min(previous, current);
    }
}
