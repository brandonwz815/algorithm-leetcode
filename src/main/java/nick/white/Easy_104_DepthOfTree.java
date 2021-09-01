package nick.white;

import util.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Easy_104_DepthOfTree {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        Deque<TreeNode> path = new LinkedList<>();
        Deque<TreeNode> list = new LinkedList<>();

        TreeNode rootNode = root;
        path.offerLast(rootNode);
        list.offerLast(rootNode);
        int cal = rootNode.val;

        while (cal != sum && !list.isEmpty()) {
            TreeNode pop = list.pollLast();

            if (pop.left != null) {
                cal += pop.left.val;
                if (cal < sum) {
                    path.offerLast(pop.left);
                } else if (cal == sum) {
                    return true;
                } else {
                    cal -= pop.left.val;
                }
            } else if (pop.right != null) {
                cal += pop.right.val;
                if (cal < sum) {
                    path.offerLast(pop.right);
                } else if (cal == sum) {
                    return true;
                }
            } else {
                path.pollLast();
            }
        }
        return false;
    }

}