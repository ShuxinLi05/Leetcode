package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";

        System.out.println(romanToInt(s1)); //3
        System.out.println(romanToInt(s2)); //4
        System.out.println(romanToInt(s3)); //9
        System.out.println(romanToInt(s4)); //58
        System.out.println(romanToInt(s5)); //1994
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -=map.get(s.charAt(i));
            } else {
                result +=map.get(s.charAt(i));
            }
        }
        return result;
    }
}
