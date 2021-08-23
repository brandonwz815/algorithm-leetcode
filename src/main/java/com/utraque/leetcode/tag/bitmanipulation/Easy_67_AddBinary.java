package com.utraque.leetcode.tag.bitmanipulation;

public class Easy_67_AddBinary {

    public static void main(String[] args) {
        System.out.printf(" After: %s", addBinary("1010", "1011"));
        System.out.println();
        System.out.printf(" After: %s", addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if (aLen > bLen) {
            int diff = aLen - bLen;
            b = padString(b, diff);
        } else if (aLen < bLen) {
            int diff = bLen - aLen;
            a = padString(a, diff);
        }

        System.out.println("a: " + a + " b:" + b);
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();

        int length = aChar.length;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            int x = aChar[i] - '0';
            int y = bChar[i] - '0';
            int sum = x + y + carry;
            if (sum == 3) {
                carry = 1;
                sb.append("1");
            } else if (sum == 2) {
                carry = 1;
                sb.append("0");
            } else if (sum == 1) {
                carry = 0;
                sb.append("1");
            } else if (sum == 0) {
                carry = 0;
                sb.append("0");
            }
        }
        System.out.println(sb);
        if (carry == 1) {
            sb.append("1");
        }
        System.out.println(sb);
        return sb.reverse().toString();
    }


    public static String padString(String b, int diff) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < diff; i++) {
            sb.append("0");
        }

        return sb.append(b).toString();
    }

}

/**
 *  Key: To get the value of a someChar, use
 *      int value = someChar - '0';
 *
 *  With out " - '0' ", the value is incorrect!
 *
 */
