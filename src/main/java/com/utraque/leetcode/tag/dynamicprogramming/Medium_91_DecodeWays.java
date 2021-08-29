package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_91_DecodeWays {

    public static void main(String[] args) {
        String s = "226";
//        String s = "229";
//        String s = "206";
        System.out.printf(" After: %s", numDecodings(s));
    }

    private static int numDecodings(String s) {
        return getNumDecodings(s);
    }

    private static int getNumDecodings(String s) {
        if (s.length() == 0 || s == "0") return 0;
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) {
            return 1;
        }
        if (s.length() == 2 && Integer.valueOf(s) <= 26) {
            return 2;
        }

        int a = getNumDecodings(s.substring(1));
        int b = getNumDecodings(s.substring(2));
        return a + b;
    }


}


/**
 *
 * [TIPS]
 *
 *       if (s.charAt(0) == '0')
 *
 *       NOT
 *
 *       if (s.charAt(0) == 0)       !!!!!!!!!!!!!
 *
 */
