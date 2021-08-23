package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_55_JumpGame_bruteforce {

    public static void main(String[] args) {
        int[] input = {2, 3, 1, 1, 4};
        System.out.printf(" After: %s", canJump(input));
        System.out.println();

        int[] input2 = {3, 2, 1, 0, 4};
        System.out.printf(" After: %s", canJump(input2));
    }

    private static boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        return canJump(nums, nums.length - 1);
    }

    private static boolean canJump(int[] nums, int curIndex) {
        if (curIndex == 0) return true;

        for (int i = curIndex - 1; i >= 0; i--) {
            int diff = curIndex - i;
            if (nums[i] >= diff) {
                return canJump(nums, i);  // DFS: depth-first, keep drilling down
            }
        }

        return false;
    }

}
