package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class Medium_55_JumpGame_DP {

    public static void main(String[] args) {

        Map<Integer, Boolean> memo = new HashMap<>();
        int[] input = {2, 3, 1, 1, 4};
        System.out.printf(" After: %s", canJump(input, memo));
        System.out.println();

        //-------------------------------------

        Map<Integer, Boolean> memo2 = new HashMap<>();
        int[] input2 = {3, 2, 1, 0, 4};
        System.out.printf(" After: %s", canJump(input2, memo2));
    }

    public static boolean canJump(int[] nums, Map<Integer, Boolean> memo){
        if (nums.length == 1) return true;
        return canJump(nums, nums.length - 1, memo);
    }

    private static boolean canJump(int[] nums, int curIndex,  Map<Integer, Boolean> memo) {
        if (curIndex == 0) return true;
        if (memo.containsKey(curIndex)) return memo.get(curIndex);

        for (int i = curIndex - 1; i >= 0; i--) {
            int diff = curIndex - i;
            if (nums[i] >= diff) {
                boolean result = canJump(nums, i, memo);  // DFS: depth-first, keep drilling down
                memo.put(curIndex, result);
                return result;
            }
        }

        memo.put(curIndex, false);
        return false;
    }

}
