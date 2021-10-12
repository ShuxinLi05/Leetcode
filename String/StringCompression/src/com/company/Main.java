package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] chars1 = {'a','a','b','b','c','c','c'};
        char[] chars2 = {'a'};
        char[] chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] chars4 = {'a','a','a','b','b','a','a'};

        compress(chars1);
        compress(chars2);
        compress(chars3);
        compress(chars4);

    }
    public static int compress(char[] chars) {

        int index = 0;
        int p1 = 0;
        StringBuilder output = new StringBuilder();

        while(p1 < chars.length){
            int p2 = p1;
            while (p2 < chars.length && chars[p2] == chars[p1]){
                p2++;
            }
            chars[index++] = chars[p1];
            if (p2 - p1 > 1){
                String count = p2 - p1 + "";
                for(char c: count.toCharArray()){
                    chars[index++] = c;
                }

            }
            p1 = p2;

        }
        return index;
    }
}
