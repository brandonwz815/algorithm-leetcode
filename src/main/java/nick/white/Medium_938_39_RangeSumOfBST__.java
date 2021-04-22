package nick.white;

import java.util.ArrayDeque;
import java.util.Queue;

public class Medium_938_39_RangeSumOfBST__ {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        System.out.printf("Before execution: %s\n", root);

        System.out.printf(" After execution: %s\n", rangeSumBST(root, 3, 15));

    }

    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        int rangeSum = 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            if (node.val >= L && node.val <= R) {
                rangeSum += node.val;
            }
            if (node.left != null && node.left.val >= L) {
                queue.offer(node.left);
            }
            if (node.right != null && node.right.val <= R) {
                queue.offer(node.right);
            }
        }
        return rangeSum;
    }

}
