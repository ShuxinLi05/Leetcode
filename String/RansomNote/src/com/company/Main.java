package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String ransomNote1 = "a";
        String magazine1 = "b";
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println(canConstruct(ransomNote1,magazine1)); //false
        System.out.println(canConstruct(ransomNote2,magazine2)); //false
        System.out.println(canConstruct(ransomNote3,magazine3)); //true

    }

    private static boolean canConstruct (String ransomNote, String magazine)
    {
        HashMap<Character, Integer> magMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
        {
            char ch = magazine.charAt(i);
            int count = magMap.getOrDefault(ch, 0) + 1;
            magMap.put(ch, count);
        }

        for(int i = 0; i < ransomNote.length(); i++)
        {
            char ch = ransomNote.charAt(i);
            if(!magMap.containsKey(ch) || magMap.get(ch) <=0)
            {
                return false;
            }
            int count = magMap.getOrDefault(ch, 0) - 1;
            magMap.put(ch, count);
        }
        return true;

    }
}
