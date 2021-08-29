package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_91_DecodeWays_bad {

    public static void main(String[] args) {
//        String s = "226";
//        String s = "229";
        String s = "206";
        System.out.printf(" After: %s", numDecodings(s));
    }

    private static int numDecodings(String s) {
        return getNumDecodings(s);
    }

    private static int getNumDecodings(String s) {
        if (s.length() == 0 || s=="0") return 0;
        if (s.charAt(0) == 0) return 0;
        if (s.length() == 1) {
            return 1;
        }
        if (s.length()==2 && Integer.valueOf(s) <=26) {
            return 2;
        }
//        String substr = s.substring(0, 2);
//        if (Integer.valueOf(substr)>26) return 0;

        int a =  getNumDecodings(s.substring(1));
        int b =  getNumDecodings(s.substring(2));
        return a + b;

//        if (s.charAt(1) == 0) {
//            if (s.charAt(2) == 0) return 0;
//            if (Integer.valueOf(s.substring(0, 2)) > 26) return 0;
//            return getNumDecodings(s.substring(2));
//        } else if (Integer.valueOf(s.substring(0, 2)) <= 26) {
//            return getNumDecodings(s.substring(1)) + getNumDecodings(s.substring(2));
//        }
//        return 0;
    }

}

/**
 *
 *  Get the base cases right: Don't forget
 *      if (s.length()==2) return 2;
 *
 */
