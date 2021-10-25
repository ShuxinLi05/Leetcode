package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";
        System.out.println(firstUniqChar(s1)); //0
        System.out.println(firstUniqChar(s2)); //2
        System.out.println(firstUniqChar(s3)); //-1

    }
    public static int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
