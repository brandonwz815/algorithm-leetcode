package nick.white;

import java.util.Arrays;

/**
 * O(nlogn)
 * The array is sorted in a special way
 */
public class Easy_852_49_PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] A = new int[]{0, 2, 1, 0};
        System.out.printf("Before: %s\n", Arrays.toString(A));  // use Arrays.toString(A) to print
        System.out.printf(" After: %d", peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
        return findPeak(A, 0, A.length - 1);
    }

    private static int findPeak(int[] A, int start, int end) {

        int mid = (end - start + 1) / 2 + start;

        if (end - start == 2) {
            return mid;
        }
        if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) {
            return mid;
        }
        if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
            return findPeak(A, mid, end);
        }
        if (A[mid - 1] > A[mid] && A[mid] > A[mid + 1]) {
            return findPeak(A, start, mid);
        }
        return -1; // error
    }
}
