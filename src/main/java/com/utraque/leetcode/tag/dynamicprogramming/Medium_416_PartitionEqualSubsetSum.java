package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.Arrays;

public class Medium_416_PartitionEqualSubsetSum {

    public static void main(String[] args) {
//        int[] nums = {1, 5, 11, 5}; // true
        int[] nums = {1,2,3,5};  // false
        System.out.printf(" After: %s", canPartition(nums));
    }

    private static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if ((sum & 1) == 1) return false;
        sum /= 2;

        Arrays.sort(nums);

        return doCanPartition(nums, sum, nums.length - 1);
    }

    private static boolean doCanPartition(int[] nums, int sum, int n) {
        if (n == 0) return true;
        if (sum < nums[n]) return doCanPartition(nums, sum, n - 1);
        return doCanPartition(nums, sum - nums[n], n - 1);
    }

}
