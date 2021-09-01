package nick.white;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * In order traversal, after a Null node
 * there should be no following node
 */
public class Medium_958_42_CheckCompletenessOfABinaryTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n", isCompleteTree(root));
    }

    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return false;
        }

        Deque<TreeNode> deque = new ArrayDeque<>(); // stack
        deque.offerLast(root);

        while (deque.size() > 0) {
            TreeNode node = deque.pollLast();

            if (node.right != null) {
                deque.offerLast(node.right);
            }
            if (node.left != null) {
                deque.offerLast(node.left);
            }
            if (node.left == null) {
                if (deque.size() > 0 || node.right != null) {
                    return false;
                }
            }
        }
        return true;
    }

}
