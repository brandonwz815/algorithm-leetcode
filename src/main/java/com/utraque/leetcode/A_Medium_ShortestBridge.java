package com.utraque.leetcode;

public class A_Medium_ShortestBridge {

    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}};

        System.out.printf(" After: %s", run(input));
    }

    private static int run(int[][] grid) {
        int shortestFlips = Integer.MAX_VALUE;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    int flips = getFlips(grid, i, j);
                    if (flips < shortestFlips) shortestFlips = flips;
                }
            }
        }
        return shortestFlips;
    }

    public static int getFlips(int[][] inputGrid, int i, int j) {
        int[][] grid = cloneGrid(inputGrid);
        int rows = grid.length;
        int cols = grid[0].length;

        int tries = 1;
        grid[i][j] = 1;
        while (!isConnected(grid)) {

            boolean added = false;
            if (i > 0 && i <= rows - 1) {
                if (grid[i - 1][j] == 0) {
                    grid[i - 1][j] = 1;
                    added = true;
                }
            }
            if (i <= rows - 2) {
                if (grid[i + 1][j] == 0) {
                    grid[i + 1][j] = 1;
                    added = true;
                }
            }
            if (j >= 1 && j <= cols - 1) {
                if (grid[i][j - 1] == 0) {
                    grid[i][j - 1] = 1;
                    added = true;
                }
            }
            if (j < cols - 2) {

                if (grid[i][j + 1] == 0) {
                    grid[i][j + 1] = 1;
                    added = true;
                }

            }
            if (added) tries++;
        }
//        if (!connected) bfs(grid, );
//        else
        return  0;
    }

    private static boolean isConnected(int[][] grid) {
        return false;
    }

    public static int[][] cloneGrid(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] newGrid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newGrid[i][j] = grid[i][j];
            }
        }
        return newGrid;
    }
}