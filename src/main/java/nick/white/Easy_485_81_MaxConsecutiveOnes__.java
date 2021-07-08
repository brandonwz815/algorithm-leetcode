package nick.white;

/**
 * A slightly better solution, with
 * reduced number of Math.max(max, temp) calls
 *
 */
public class Easy_485_81_MaxConsecutiveOnes__ {

    public static void main(String[] args) {
        int[] input = {1, 1, 0, 1, 1, 1};
        System.out.printf(" After: %s\n:", findMax(input));
    }

    public static int findMax(int[] nums) {
        int max = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            }
            if (i == nums.length - 1 || nums[i + 1] == 0) { // peek into next one
                max = Math.max(max, temp);
                temp = 0;
            }
        }
        return max;
    }
}
