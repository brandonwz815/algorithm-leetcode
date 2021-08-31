package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Medium_368_LargestDivisibleSubset {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 8, 32};
        System.out.printf(" After: %s", largestDivisibleSubset(nums));
    }

    private static List<Integer> largestDivisibleSubset(int[] nums) {
        return getLargestDivisibleSubSet(nums, nums.length - 1);
    }

    private static List<Integer> getLargestDivisibleSubSet(int[] nums, int n) {
        List<Integer> result = new ArrayList<>();
        if (n == 0) {
            result.add(nums[0]);
            return result;
        }
        if (n == 1) {
            if (nums[n] % nums[n - 1] == 0) {
                result.add(nums[n]);
                result.add(nums[n - 1]);
                return result;
            }
            result.add(nums[n]);
            return result;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[n] % nums[i] == 0) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[n]);
                temp.addAll(getLargestDivisibleSubSet(nums, i));
                if (temp.size() > result.size()) {
                    result = temp;
                }
            }
        }

        return result;
    }

}

/**
 * [TIPS]
 * check if index==1 or index==0, not nums.size() !
 */