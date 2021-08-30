package com.utraque.leetcode.tag.dynamicprogramming;

public class Hard_132_PalindromicPartitioningII {

    public static void main(String[] args) {
        String s = "caabc";
        System.out.printf(" After: %s", minCut(s));
    }

    private static int minCut(String s) {
        return getMinCut(s);
    }

    private static int getMinCut(String s) {
        if (s.length() == 1) return 0;
        if (s.length() == 2) return 1;

        int length = s.length();

        int minCuts = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            String prefix = s.substring(0, i + 1);
            if (isPalindromic(prefix)) {
                int suffixCuts = getMinCut(s.substring(i + 1));
                if (suffixCuts + 1 < minCuts) {
                    minCuts = suffixCuts + 1;
                }
            }
        }
        return minCuts;
    }

    private static boolean isPalindromic(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

}
