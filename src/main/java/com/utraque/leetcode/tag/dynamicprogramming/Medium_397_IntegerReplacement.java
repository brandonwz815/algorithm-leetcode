package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_397_IntegerReplacement {

    public static void main(String[] args) {
        int n = 4;
        System.out.printf(" After: %s", integerReplacement(n));
    }

    private static int integerReplacement(int n) {
        return getIntegerReplacement(n);
    }

    private static int getIntegerReplacement(int n) {
        if (n == 1) return 0;

        int min = Integer.MAX_VALUE;

        if ((n & 1) == 0) {
            System.out.println("n=" + n + " " + (n & 1));
            min = 1 + getIntegerReplacement(n / 2);
        } else {
            min = 1 + Math.min(getIntegerReplacement(n + 1), getIntegerReplacement(n - 1));
        }
        return min;
    }


}
