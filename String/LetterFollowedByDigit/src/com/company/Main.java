package com.company;

public class Main {

    public static void main(String[] args) {
        String letter1 = "1A3d4s5t "; //true
        String letter2 = "A2bb2d4"; //false
        letterFollDigit(letter1);
        letterFollDigit(letter2);
    }
    public static void letterFollDigit(String str) {
        char[] strLetter = str.toCharArray();
        for (int i = 0, j = 1; i < strLetter.length && j < strLetter.length; i++, j++) {
            if (Character.isLetter(strLetter[i]) != Character.isLetter(strLetter[j])) {
                if (j == strLetter.length - 1) {
                    System.out.println("True");
                }
                continue;
            } else {
                System.out.println("False");
                break;
            }

        }
    }
}
