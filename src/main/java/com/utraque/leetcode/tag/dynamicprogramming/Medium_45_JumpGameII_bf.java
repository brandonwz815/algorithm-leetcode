package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Medium_45_JumpGameII_bf {

    public static void main(String[] args) {
        int[] input = {2, 3, 1, 1, 4};
        System.out.printf(" After: %s", jump(input));
        System.out.println();

        int[] input2 = {2, 3, 1, 0, 1, 4};
        System.out.printf(" After: %s", jump(input2));
    }

    private static int jump(int[] nums) {
        if (nums.length == 1) return 1;
        return jump(nums, nums.length - 1).size();
    }

    public static List<Integer> jump(int[] nums, int curIndex) {

        if (curIndex == 0) {
            return Collections.emptyList();
        }

        List<Integer> minJumps = null;

        for (int i = curIndex - 1; i >= 0; i--) {
            int diff = curIndex - i;
            if (nums[i] >= diff) {
                List<Integer> jumps = new ArrayList<>();
                jumps.add(i);
                jumps.addAll(jump(nums, i));

                /*
                 *   ****** must use: if (minJumps == null)
                 *   Cannot use minJumps.size()
                 */
                if (minJumps == null || jumps.size() < minJumps.size()) {
                    minJumps = jumps;
                }
            }
        }
        return minJumps;
    }

}


/**
 *
 * Note:
 * List<Integer> minJumps = new ArrayList<>(nums.length);
 * // minJumps.size() returns 0 !!!!!!!!!!!!!!!!!
 *
 */
