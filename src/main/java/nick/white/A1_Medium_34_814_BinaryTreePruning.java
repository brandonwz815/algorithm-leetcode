package nick.white;

import java.util.ArrayDeque;
import java.util.Deque;

public class A1_Medium_34_814_BinaryTreePruning {

    public static void main(String[] args) {

    }

    public static TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.offer(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();;

            if (node.left == null && node.right == null && node.val == 0) {
                node = null;
            } else {
                stack.offerLast(node); // ice stack.off(node);

                if (node.right != null) {
                    stack.offerLast(node.right);
                }

                if (node.left != null) {
                    stack.offerLast(node.left);
                }
            }
        }
        return root;
    }

}
