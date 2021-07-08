package nick.white;

import java.util.Arrays;

public class Medium_503_101_NextGreaterElementII__ {

    public static void main(String[] args) {
        int[] input = {1, 2, 1};
        System.out.printf(" After: %s", Arrays.toString(nextGreaterElements(input)));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return nums;
        }

        int[] result = new int[length];
        Arrays.fill(result, -1);

        int[] source = new int[length * 2];
        for (int i = 0; i < length; i++) {
            source[i] = nums[i];
            source[i + length] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= length - 1; j++) {
                if (nums[i] < source[i + j]) {
                    result[i] = source[i + j];
                }
            }
        }

        return result;
    }
}
