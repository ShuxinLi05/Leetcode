package com.company;

public class Main {

    public static void main(String[] args) {

        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1,num2));

        String num3 = "456";
        String num4 = "77";
        System.out.println(addStrings(num3,num4));

        String num5 = "0";
        String num6 = "0";
        System.out.println(addStrings(num5,num6));

    }

    public static String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i1 = num1.length()-1;
        int i2 = num2.length()-1;

        while (carry >0 || i1 >= 0 || i2 >= 0){
            int v1 = (i1 >= 0) ? num1.charAt(i1) - '0' : 0;
            int v2 = (i2 >= 0) ? num2.charAt(i2) - '0' : 0;
            int sum = v1 + v2 + carry;
            int value = sum % 10;
            carry = sum / 10;
            result.append(value);

            i1 --;
            i2 --;

        }
        return result.reverse().toString();
    }

}
