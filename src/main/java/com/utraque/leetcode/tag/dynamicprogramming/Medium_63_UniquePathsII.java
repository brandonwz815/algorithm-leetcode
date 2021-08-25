package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_63_UniquePathsII {

    public static void main(String[] args) {
//        int[][] input = {{0,1}, {0,  0}};
        int[][] input = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.printf(" After: %s", uniquePathsWithObstacles(input));
    }

    private static int uniquePathsWithObstacles(int[][] grid) {
        return getUniquePathsWithObstacles(grid, 0, 0);
    }

    private static int getUniquePathsWithObstacles(int[][] grid, int m, int n) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (m > rows - 1 || n > cols - 1) return 0;
        if (m == rows - 1) return 1;
        if (n == cols - 1) return 1;

        return (grid[m + 1][n] == 0 ? getUniquePathsWithObstacles(grid, m + 1, n) : 0) +
                (grid[m][n + 1] == 0 ? getUniquePathsWithObstacles(grid, m, n + 1) : 0);
    }

}
