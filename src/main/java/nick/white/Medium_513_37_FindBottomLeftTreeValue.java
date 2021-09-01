package nick.white;

import util.TreeNode;

import java.util.*;

public class Medium_513_37_FindBottomLeftTreeValue {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.right.left.left = new TreeNode(7);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n ", findBottomLeftValue(root));

    }

    public static int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

//        Map<Integer, Integer> levelLeft = new HashMap<>();

        List<Integer> output = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode node = root;
        queue.offer(node);
        while (queue.size() > 0) {
            node = queue.poll();
            output.add(node.val);

            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
        }
        return node.val;
    }

}
