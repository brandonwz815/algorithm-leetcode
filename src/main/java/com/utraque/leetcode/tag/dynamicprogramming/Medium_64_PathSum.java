package com.utraque.leetcode.tag.dynamicprogramming;

public class Medium_64_PathSum {

    public static void main(String[] args) {
//        int[][] input = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] input = {{1, 2,3}, {4, 5,6}};
        System.out.printf(" After: %s", minPathSum(input));
    }

    public static int minPathSum(int[][] grid) {
        return getPathSum(grid, 0, 0);
    }

    private static int getPathSum(int[][] grid, int curRow, int curCol) {
        int rows = grid.length;
        int cols = grid[0].length;

        int curVal = grid[curRow][curCol];
        if (curRow == rows - 1 && curCol == cols - 1) {
            return curVal;
        }

        if (curRow == rows - 1 && curCol < cols - 1) {
            return curVal + getPathSum(grid, curRow, curCol + 1);
        }
        if (curRow < rows - 1 && curCol == cols - 1) {
            return curVal + getPathSum(grid, curRow + 1, curCol);
        } else return Math.min(
                curVal + getPathSum(grid, curRow + 1, curCol),
                curVal + getPathSum(grid, curRow, curCol + 1)
        );

    }

}
