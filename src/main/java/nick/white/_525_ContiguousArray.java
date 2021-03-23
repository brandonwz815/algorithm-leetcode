package nick.white;

import java.util.HashMap;
import java.util.Map;

public class _525_ContiguousArray {

    public static void main(String[] args) {
        int[] input = {0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0};
        int result = compute(input);
        System.out.println("Result is " + result);
    }

    private static int compute(int[] nums) {
        Map<Integer, Integer> counts = new HashMap();
        counts.put(0, -1);

        int maxLength = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count += -1;
            } else {
                count += 1;
            }

            if (counts.containsKey(count)) {
                maxLength = Math.max(maxLength, i - counts.get(count));
            } else {
                counts.put(count, i);
            }

            System.out.println("value=" + nums[i] + " count=" + count + " maxlength=" + maxLength + " i=" + i + " counts.get(" + count + ")=" + counts.get(count));
        }

        return maxLength;
    }
}