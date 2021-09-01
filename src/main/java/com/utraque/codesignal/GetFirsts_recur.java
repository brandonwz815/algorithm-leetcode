package com.utraque.codesignal;

import java.util.Arrays;

public class GetFirsts_recur {

    public static void main(String[] args) {
        int[] nums = {3, 3, 5, 2, 3};
        System.out.printf(" After: %s", getFirsts(nums));
    }

    private static Object getFirsts(int[] nums) {
        return doGetFirsts(nums, 0);
    }

    private static int doGetFirsts(int[] nums, int n) {
//        System.out.println(Arrays.toString(nums) + " " + n);

        int result = 0;
        int length = nums.length;
        if (n == length - 1)  {
            result = nums[n];
            nums[0] = 0;
            return result;
        }

//        System.out.println("aa");
        int idx = 0;
        int val = 0;
        boolean found = false;
        for (int i = n; i < length; i++) {
            if (nums[i] !=0) {
                idx = i;
                val = nums[i];
                found = true;
                break;
            }
        }
//        System.out.println("bb "+found);
        if (!found) return 0;

        for (int i = idx; i < length; i++) {
            int diff = nums[i] - val;
            if (diff < 0) {
                break;
            } else {
                nums[i] = diff;
            }
        }
        return val + doGetFirsts(nums, idx);
    }

}
