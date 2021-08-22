package com.utraque.leetcode;

import java.util.Arrays;

public class Medium_74_SearchA2DMatrix {

    public static void main(String[] args) {
        int[][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.printf(" After: %b\n", run(matrix, 3));

        int[][] matrix2 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.printf(" After: %b", run(matrix2, 13));
    }

    private static boolean run(int[][] matrix, int target) {
        return searchMatrix(matrix, 0, matrix.length, target);
    }

    private static boolean searchMatrix(int[][] matrix, int start, int rows, int target) {

        int cols = matrix[0].length;

        int midrow = rows / 2 + start;

        if (matrix[midrow][0] == target) return true;
        if (matrix[midrow][cols - 1] == target) return true;
        if (matrix[midrow][0] < target && matrix[midrow][cols - 1] > target) {
//            return Arrays.binarySearch(matrix[midrow], target) > 0;  // works!!
//            return search(matrix[midrow], 0, cols - 1, target);      // works!!
            int low = 0;
            int high = cols -1;
            while (low <= high) {
                int mid = low + (high-low) / 2;
                if (target == matrix[midrow][mid]) return true;
                if (target >  matrix[midrow][mid]) low = mid + 1;
                if (target <  matrix[midrow][mid]) high = mid - 1;
            }
            return false;
        }
        if (matrix[midrow][0] > target) {
            return searchMatrix(matrix, start, rows / 2, target);
        }
        if (target > matrix[midrow][cols - 1]) {
            return searchMatrix(matrix, midrow + 1, rows / 2, target);
        }
        return false;
    }

    private static boolean search(int[] matrix, int start, int end, int target) {
        if (end == start) return target == matrix[start];
        int mid = start + (end - start) / 2;
        System.out.println(mid);
        if (matrix[mid] == target) return true;

        if (target < matrix[mid] && start < mid - 1) return search(matrix, start, mid - 1, target);
        if (target > matrix[mid] && mid + 1 < end) return search(matrix, mid + 1, end, target);
        return false;
    }

}

/**
 * Note:
 * Must check conditions:
 *   1) start < mid - 1
 *   2) mid + 1 < end
 */