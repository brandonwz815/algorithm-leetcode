package nick.white;

import java.util.Arrays;

/**
 * One pass
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class Easy_905_57_SortArrayByParity__ {

    public static void main(String[] args) {
        int[] input = {3, 1, 2, 4};
        System.out.printf(" After: %s\n", Arrays.toString(sortArrayByParity(input)));
    }

    public static int[] sortArrayByParity(int[] A) {

        if (A.length < 2) {
            return A;
        }

        int aPointer = 0;
        int bPointer = A.length - 1;

        while (aPointer < bPointer) {
            if (A[aPointer] % 2 == 0) {
                aPointer++;
                continue;
            }
            if (A[bPointer] % 2 == 1) {
                bPointer--;
                continue;
            }
            int temp = A[aPointer];
            A[aPointer] = A[bPointer];
            A[bPointer] = temp;
            aPointer++;
            bPointer--;
        }
        return A;
    }
}
