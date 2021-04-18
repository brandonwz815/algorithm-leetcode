package nick.white;

import java.util.Arrays;

/**
 * Worst O(n2)
 */
public class Medium_16_3SumClosest {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 2, 1, -4};
       // System.out.println(nums);

        Arrays.sort(nums); // O(nlogn), NECESSARY for 2-pointer strategy
        System.out.println(threeSumClosest(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int ret = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int aPointer = i + 1;
            int bPointer = nums.length - 1;
            while (aPointer < bPointer) {
                int curSum = nums[i] + nums[aPointer] + nums[bPointer];
                if (curSum > target) {
                    bPointer--;
                } else {
                    aPointer++;
                }

                if (Math.abs(curSum - target) < Math.abs(ret - target)) {
                    ret = curSum;
                }
            }
        }
        return ret;
    }
}

