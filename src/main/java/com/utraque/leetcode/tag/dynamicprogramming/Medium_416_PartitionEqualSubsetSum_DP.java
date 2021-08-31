package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.Arrays;

public class Medium_416_PartitionEqualSubsetSum_DP {

    public static void main(String[] args) {
//        int[] nums = {1, 5, 11, 5}; // true
        int[] nums = {1, 2, 3, 5};  // false
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

        Boolean[][] memo = new Boolean[nums.length][sum + 1];  // memoization

        return doCanPartition(nums, sum, nums.length - 1, memo);
    }

    private static boolean doCanPartition(int[] nums, int sum, int n, Boolean[][] memo) {
        if (n == 0) return true;
        if (memo[n][sum] != null) return memo[n][sum];
        if (sum < nums[n]) {
            boolean tf = doCanPartition(nums, sum, n - 1, memo);
            memo[n - 1][sum] = tf;
            return tf;
        }
        boolean tf = doCanPartition(nums, sum - nums[n], n - 1, memo);
        memo[n - 1][sum - nums[n]] = tf;
        return tf;
    }

}
