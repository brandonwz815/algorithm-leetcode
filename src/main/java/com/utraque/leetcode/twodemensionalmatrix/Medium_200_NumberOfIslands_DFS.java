package com.utraque.leetcode.twodemensionalmatrix;

public class Medium_200_NumberOfIslands_DFS {

    public static void main(String[] args) {
        String[][] input = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}};
        System.out.printf(" After: %s", numIslands(input));
    }

    private static int numIslands(String[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if(grid[i][j].equals("1")) {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    private static void dfs(String[][] grid, int i, int j) {
        grid[i][j]="0";

        int rows = grid.length;
        int cols = grid[0].length;

        if (i >=1  && i <=rows-1 && grid[i-1][j].equals("1")) dfs(grid, i-1, j);
        if (i >=0  && i <=rows-2 && grid[i+1][j].equals("1")) dfs(grid, i+1, j);
        if (j >=1  && j <=cols-1 && grid[i][j-1].equals("1")) dfs(grid, i, j-1);
        if (j >=0  && j <=cols-2 && grid[i][j+1].equals("1")) dfs(grid, i, j+1);
    }

}

/**
 *   Use the stack of method dfs() instead of an explicit stack
 */
