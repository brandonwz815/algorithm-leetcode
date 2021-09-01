package nick.white;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Medium_199_45_BinaryTreeRightSideShow {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n", rightSideShow(root));
    }

    public static List<Integer> rightSideShow(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.size() > 0) {
            int size = queue.size(); // take nodes of each level
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (i == 0) { // only consider the right-most node
                    result.add(node.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
            }
        }

        return result;
    }
}
