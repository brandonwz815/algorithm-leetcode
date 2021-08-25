package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_1696_JumpGameVI_bf {

    public static void main(String[] args) {
        int[] nums = {1,-1,-2,4,-7,3};
//        int[] nums = {2, -1, -2, 4};
        int k = 2;
        System.out.printf(" After: %s", maxResult(nums, k)); // 17
    }

    private static int maxResult(int[] nums, int k) {
        return maxResult(nums, 0, k);
    }

    private static int maxResult(int[] nums, int curIndex, int k) {
        int length = nums.length;
        if (curIndex == length - 1) return nums[length - 1];

        int maxResult = Integer.MIN_VALUE;
        int curVal = nums[curIndex];

        for (int i = curIndex+1; i <= (curIndex+k) && i < length; i++) {  // Be careful with the indices!!!
                int nextMaxResult = curVal + maxResult(nums, i, k);
//                if(nextMaxResult==6) {
//                    System.out.println();
//                }
                if (nextMaxResult > maxResult) {
                    maxResult = nextMaxResult;
                }
        }
//        System.out.println("curIndex="+curIndex+" " +maxResult);
        return maxResult;
    }

}


/**
 *
 * Be VERY CAREFUL with the conditions...
 * I used i < (curIndex + k) and the result was wrong
 *
 */