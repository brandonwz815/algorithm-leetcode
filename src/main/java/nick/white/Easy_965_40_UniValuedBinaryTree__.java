package nick.white;

import java.util.ArrayDeque;
import java.util.Queue;

public class Easy_965_40_UniValuedBinaryTree__ {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(1);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);

        System.out.printf("Before: %s: ", root);
        System.out.println();
        System.out.printf(" After: %s:", isUnivalTree(root));
    }

    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int val = 0;
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            if (val == 0) {
                val = node.val;
            } else if (val != node.val) {
                return false;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return true;
    }
}
