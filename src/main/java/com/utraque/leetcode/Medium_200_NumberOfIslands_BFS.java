package com.utraque.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  A BFS search instead of a DFS search
 */
public class Medium_200_NumberOfIslands_BFS {

    public static void main(String[] args) {
        String[][] input = {
                {"1", "1", "0", "0", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "1", "0", "0"},
                {"0", "0", "0", "1", "1"}};
        System.out.printf(" After: %s", numIslands(input));
    }

    static class Node {
        public int row;
        public int col;

        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int numIslands(String[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Deque<Node> queue = new ArrayDeque<>();
                if (grid[i][j].equals("1")) {
                    islands++;
                    queue.offer(new Node(i, j));
                    while (!queue.isEmpty()) {
                        Node node = queue.poll();
                        int row = node.row;
                        int col = node.col;
                        System.out.println("" + row + " " + col);
                        grid[row][col] = "0";
                        if (row >= 1 && row <= rows - 1 && grid[row - 1][col].equals("1")) queue.offer(new Node(row - 1, col));
                        if (row >= 0 && row <= rows - 2 && grid[row + 1][col].equals("1")) queue.offer(new Node(row + 1, col));
                        if (col >= 1 && col <= cols - 1 && grid[row][col - 1].equals("1")) queue.offer(new Node(row, col - 1));
                        if (col >= 0 && col <= cols - 2 && grid[row][col + 1].equals("1")) queue.offer(new Node(row, col + 1));
                    }
                }
            }
        }
        return islands;
    }
}
