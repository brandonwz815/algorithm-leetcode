/**
 * Copyright of Utraque.com.  All rights reserved.
 */
package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 *
 * @author tiger
 */
public class _1_TwoSum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};    // or new int[]{2, 7, 11, 15}s
        int target = 9;

        System.out.print(Arrays.toString(brutalForce(nums, target)));
        System.out.print(Arrays.toString(linearImpl(nums, target)));
        System.out.print(Arrays.toString(linearImplOnePass(nums, target)));
    }

    public static int[] brutalForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                int diff = target - nums[i];
                for (int j = i + 1; j < nums.length - i - 1; j++) {
                    if (diff == nums[j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

//	// necessary?
//	public static int[] twoSumWithSortedArray(int[] nums, int target) {
//		int left = 0;
//		int right = nums.length - 1;
//		int mid = nums.length / 2;
//		if(right < target) {
//			int val = binarySearch(nums, target - nums[right]);
//			return new int[]{val, right};
//		}
//		return null;
//	}
//
//	private static int binarySearch(int[] nums, int target) {
//		int left = 0;
//		int right = nums.length - 1;
//		int mid = nums.length / 2;
//		while(true) {
//			if(nums[mid] < target && nums[mid+1] > target) {
//				return target;
//			}
//			if(nums[mid] < target) {
//				left = mid;
//				mid = (right - left + 1) / 2 + left;
//			} else {
//				right = mid - 1;
//				if(right < left) {
//					return -1;
//				}
//				mid = (right - left + 1) / 2 + left;
//			}
//		}
//	}

    public static int[] linearImpl(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.get(diff) != null) {
                return new int[]{i, map.get(diff)};
            }
        }
        return null;
    }

//	public int linearImplJava8(int[] nums, int target) {
//		IntStream.of(nums).collect(Collectors.toMap(x -> target-x, x.))
//	}

    public static int[] linearImplOnePass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            int diff = target - nums[i];
            if (map.get(diff) != null) {
                return new int[]{map.get(diff), i};
            }
        }
        return null;
    }


}
