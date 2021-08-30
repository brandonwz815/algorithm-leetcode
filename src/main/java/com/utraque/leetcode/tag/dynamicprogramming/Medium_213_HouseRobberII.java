package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_213_HouseRobberII {

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.printf(" After: %s", rob(nums));
    }

    private static int rob(int[] nums) {
        return Math.max(doRob(nums, 0, true), doRob(nums, 1, false));
    }

    private static int doRob(int[] nums, int n, boolean firstCalled) {
        int length = nums.length;
        if (n == length - 1) {
            return firstCalled ? 0 : nums[n];
        }
        if (n == length - 2) {
            return firstCalled ? nums[n] : Math.max(nums[n], nums[n + 1]);
        }
        if (n == length - 3) {
            return firstCalled ? Math.max(nums[n], nums[n + 1]) : Math.max(nums[n] + nums[n + 2], nums[n + 1]);
        }

        return Math.max(
                nums[n] + doRob(nums, n + 2, true),
                nums[n + 1] + doRob(nums, n + 3, false)
        );
    }

}
