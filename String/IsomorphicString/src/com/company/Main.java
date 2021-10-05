package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "egg";
        String t1 = "add";
        System.out.println(isIsomorphic(s1,t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2,t2));
     }

    public static boolean isIsomorphic(String s, String t){
        int sl = s.length();
        int tl = t.length();

        if (s == null || t == null){
            return false;
        }

        if(sl != tl){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for(int i = 0; i < sl; i++){
            if(sMap.put(s.charAt(i),i) != tMap.put(t.charAt(i),i)){
                return false;
            }
        }
        return true;
    }
}
