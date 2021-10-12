package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        isPalindrome(s1);
        isPalindrome(s2);

    }

    public static boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        if(s.length() == 0 || s == null){
            return true;
        }
        while(p1 < p2 ){
            while(p1 < p2 && !Character.isLetterOrDigit(s.charAt(p1))){
                p1++;
            }
            while(p1 < p2 && !Character.isLetterOrDigit(s.charAt(p2))){
                p2--;
            }
            if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))){
                System.out.println(s + " is not a palindrome.");
                return false;
            }
            p1++;
            p2--;
        }
        System.out.println(s + " is a palindrome.");
        return true;
    }
}
