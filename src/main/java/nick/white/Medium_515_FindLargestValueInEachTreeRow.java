package nick.white;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Medium_515_FindLargestValueInEachTreeRow {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        // implementation 1
        System.out.println(largestValue(root));

        // implementatation 2
        System.out.println(getLargestValuesBFS(root));

    }

    public static List<Integer> largestValue(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }

        getLargestValues(root, ret, 0);
        return ret;
    }

    // recursive, depth-first
    private static void getLargestValues(TreeNode root, List<Integer> ret, int level) {
//        Integer curr = ret.get(level);
//        if (curr == null) {
        if (ret.size() == level) {
            ret.add(root.val);
        } else {
            ret.set(level, Math.max(ret.get(level), root.val));
        }

        if (root.left != null) {
            getLargestValues(root.left, ret, level + 1);
        }
        if (root.right != null) {
            getLargestValues(root.right, ret, level + 1);
        }

    }

    // iteration, breadth-first
    private static List<Integer> getLargestValuesBFS(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        ret.add(root.val);

        Deque<TreeNode> prevNodes = new LinkedList<>();
        prevNodes.add(root.left);
        prevNodes.add(root.right);

        Deque<TreeNode> nextNodes = new LinkedList<>();
        int currentMax = Integer.MIN_VALUE;
        while (prevNodes.peek() != null) {
            TreeNode node = prevNodes.poll();
            currentMax = Math.max(currentMax, node.val);
            if (node.left != null) {
                nextNodes.offer(node.left);
            }
            if (node.right != null) {
                nextNodes.offer(node.right);
            }

            if (prevNodes.peek() == null) {
                ret.add(currentMax);
                currentMax = Integer.MIN_VALUE;
                prevNodes = nextNodes;
                nextNodes = new LinkedList<>();
            }
        }
        return ret;
    }

}
