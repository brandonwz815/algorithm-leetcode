package nick.white;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Easy_404_50_SumOfLeftLeaves {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n", sumOfLeftLeaves(root));

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.size() > 0) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (i == 0 && node.left == null && node.right == null) {
                    sum += node.val;
                } else {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
        }
        return sum;
    }
}
