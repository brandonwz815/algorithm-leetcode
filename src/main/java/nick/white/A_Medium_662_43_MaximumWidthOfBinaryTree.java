package nick.white;

import java.util.*;

public class A_Medium_662_43_MaximumWidthOfBinaryTree {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.printf("Before: %s\n", root);
        System.out.printf(" After: %s\n", widthOfBinaryTree(root));
    }

    public static int widthOfBinaryTree(TreeNode root) {
        List<Integer> widths = new ArrayList<>();
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.size() > 0) {
            int width = queue.size();
            widths.add(width);
            Deque<TreeNode> nextLevelNodes = new ArrayDeque<>();
            for (int i = 0; i < width; i++) {
                TreeNode node = queue.poll();
                if (node == null) {
                    nextLevelNodes.offer(null);
                    nextLevelNodes.add(null);
                } else {
                    nextLevelNodes.add(node.left);
                    nextLevelNodes.add(node.right);
                }
            }
            while (nextLevelNodes.peekFirst() == null) {
                nextLevelNodes.pollFirst();
            }
            while (nextLevelNodes.peekLast() == null) {
                nextLevelNodes.pollLast();
            }
            queue.addAll(nextLevelNodes);
        }
        Collections.sort(widths);
        return widths.get(widths.size() - 1);
    }

}
