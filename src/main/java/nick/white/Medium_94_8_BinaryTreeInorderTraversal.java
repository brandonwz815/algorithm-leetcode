package nick.white;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Medium_94_8_BinaryTreeInorderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n ", inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode node = root;

        while (node != null  || deque.size() > 0) {
            while (node != null) {
                deque.offerLast(node);
                node = node.left;
            }

            node = deque.pollLast();
            output.add(node.val);

//            if (node.right != null) {
                node = node.right;
//            }
        }

        return output;
    }
}
