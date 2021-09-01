package util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() { // BFS print

        List<Integer> output = new ArrayList<>();

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(this);
        while (deque.size() > 0) {
            TreeNode node = deque.poll();
            output.add(node.val);   /* Action ! */

            if (node.left != null) {
                deque.offer(node.left);
            }
            if (node.right != null) {
                deque.offer(node.right);
            }
        }
        return output.toString();
    }

}
