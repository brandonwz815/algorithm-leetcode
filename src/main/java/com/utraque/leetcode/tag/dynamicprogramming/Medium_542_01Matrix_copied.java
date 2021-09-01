package com.utraque.leetcode.tag.dynamicprogramming;

import util.AlgoUtils;

import java.util.LinkedList;
import java.util.Queue;

public class Medium_542_01Matrix_copied {

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] result = updateMatrix(mat);
        AlgoUtils.print2DArray(result);
    }

    public static int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] currentCoordinates = queue.poll();
            for (int[] relCoord : dirs) {
                int row = currentCoordinates[0] + relCoord[0]; // row
                int col = currentCoordinates[1] + relCoord[1]; // col
                if (
                        row < 0 ||
                        row >= rows ||
                        col < 0 ||
                        col >= cols ||
                        matrix[row][col] <= matrix[currentCoordinates[0]][currentCoordinates[1]] + 1
                ) continue;
                queue.add(new int[]{row, col});
                matrix[row][col] = matrix[currentCoordinates[0]][currentCoordinates[1]] + 1;
            }
        }

        return matrix;
    }

}
