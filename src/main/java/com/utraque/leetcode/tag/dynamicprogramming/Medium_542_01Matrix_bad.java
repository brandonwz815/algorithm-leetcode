package com.utraque.leetcode.tag.dynamicprogramming;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Medium_542_01Matrix_bad {

    public static void main(String[] args) {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        System.out.printf(" After: %s", Arrays.toString(updateMatrix(mat)));
    }

    private static int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    result[i][j] = 0;
                } else {
                    Queue<Coordinate> queue = new ArrayDeque<>();
                    queue.offer(new Coordinate(i, j));
                    int level = 0;
                    int nodesInQueue = 1;
                    while (!queue.isEmpty()) {
                        int newNodesInQueue = 0;
                        for (int k = 0; k < nodesInQueue; k++) {
                            Coordinate c = queue.poll();
                            if (mat[c.row][c.col] == 0) {
                                result[i][j] = level + 1;
                                queue.clear();
                                break;
                            } else {
                                int row = c.row;
                                int col = c.col;
                                if (row >= 0 && row <= rows - 2) {
                                    newNodesInQueue += 1;
                                    queue.offer(new Coordinate(row + 1, col));
                                }
                                if (row >= 1 && row <= rows - 1) {
                                    newNodesInQueue += 1;
                                    queue.offer(new Coordinate(row - 1, col));
                                }
                                if (col >= 1 && col <= cols - 2) {
                                    newNodesInQueue += 1;
                                    queue.offer(new Coordinate(row, col - 1));
                                }
                                if (col >= 0 && col <= cols - 2) {
                                    newNodesInQueue += 1;
                                    queue.offer(new Coordinate(row, col + 1));
                                }
                            }
                        }
                        level++;
                        nodesInQueue = newNodesInQueue;
                    }
                }
            }
        }
        return result;
    }

    static class Coordinate {
        public int row;
        public int col;

        public Coordinate(int a, int b) {
            this.row = a;
            this.col = b;
        }
    }

}
