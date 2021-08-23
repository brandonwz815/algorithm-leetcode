package com.utraque.leetcode;

import nick.white.TreeNode;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Easy_637_AverageOfLevelsInBinaryTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

//        root.left.left = new TreeNode(5);
//        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s", averageOfLevels(root));
    }

    private static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        TreeNode node = root;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(node);
        int nodes = 1;

        while (!deque.isEmpty()) {
            int sum = 0;
            int nodesToAdd = 0;
            for (int i = 0; i < nodes; i++) {
                node = deque.poll();
                if (node.left != null) {
                    deque.offer(node.left);
                    nodesToAdd += 1;
                }
                if (node.right != null) {
                    deque.offer(node.right);
                    nodesToAdd += 1;
                }
                sum += node.val;
            }
            result.add(new BigDecimal(sum).divide(new BigDecimal(nodes)).doubleValue());
            nodes = nodesToAdd;
        }
        return result;
    }
}