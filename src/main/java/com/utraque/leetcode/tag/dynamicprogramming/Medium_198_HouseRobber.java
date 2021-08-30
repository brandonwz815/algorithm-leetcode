package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_198_HouseRobber {

    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.printf(" After: %s", rob(nums));
    }

    private static int rob(int[] nums) {
        return doRob(nums, 0);
    }

    private static int doRob(int[] nums, int n) {
        int length = nums.length;

        if (length - 1 == n) return nums[n];
        if (length - 2 == n) return Math.max(nums[n], nums[n + 1]);
        if (length - 3 == n) return Math.max(nums[n + 1], nums[n] + nums[n + 2]);

        return Math.max(
                nums[n] + doRob(nums, n + 2),
                nums[n + 1] + doRob(nums, n + 3)
        );
    }
}
