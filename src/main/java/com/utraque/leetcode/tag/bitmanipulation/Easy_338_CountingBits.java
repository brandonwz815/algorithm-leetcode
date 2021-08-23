package com.utraque.leetcode.tag.bitmanipulation;

import java.util.Arrays;

public class Easy_338_CountingBits {

    public static void main(String[] args) {
        System.out.printf(" After: %s", Arrays.toString(countBits(5)));
    }

    private static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            String s = Integer.toBinaryString(i);

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') count++;
            }
            result[i] = count;
        }
        return result;
    }

}
