package com.utraque.codesignal;

import java.util.Arrays;

public class GetFirsts_it {

    public static void main(String[] args) {
        int[] nums = {3, 3, 5, 2, 3};
        System.out.printf(" After: %s", getFirsts(nums));
    }

    private static int getFirsts(int[] nums) {
        int result = 0;

        int idx = 0;
        int val = 0;
        boolean end = false;
        while (idx != nums.length && !end) {
            end = true;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    idx = i;
                    val = nums[i];
                    end = false;
                    break;
                }
            }
            if (end) break;
            boolean breakInmiddle = false;
            for (int i = idx; i < nums.length; i++) {
                int diff = nums[i] - val;
                if (diff < 0) {
                    result += val;
                    breakInmiddle = true;
                    break;
                } else {
                    nums[i] = diff;
                }
            }
            if (!breakInmiddle) {
                result += val;
            }
            System.out.println(Arrays.toString(nums));
        }
        return result;
    }


}
