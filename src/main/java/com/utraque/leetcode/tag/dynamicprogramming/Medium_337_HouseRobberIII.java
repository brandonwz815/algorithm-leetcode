package com.utraque.leetcode.tag.dynamicprogramming;

import nick.white.TreeNode;

public class Medium_337_HouseRobberIII {

    public static void main(String[] args) {

//        TreeNode root = new TreeNode(3);
//
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(1);

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(4);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s", rob(root));
    }

    private static int rob(TreeNode root) {
        return doRob(root);
    }

    private static int doRob(TreeNode root) {
        if (root == null) return 0;
        if (root.left==null && root.right==null) return root.val;

        int nodesOfLevel = 0;
        if (root.left !=null) {
                nodesOfLevel += doRob(root.left.left);
                nodesOfLevel += doRob(root.left.right);
        }
        if(root.right!=null) {
                nodesOfLevel += doRob(root.right.left);
                nodesOfLevel += doRob(root.right.right);
        }
        return Math.max(
                root.val +  nodesOfLevel,
                doRob(root.left) + doRob(root.right)
        );

    }

}
