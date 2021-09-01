package nick.white;

import util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class A_Medium_979_41_DistributeCoinsInBinaryTree {

    public static void main(String[] args) {

    }

    public static int distributeCoins(TreeNode root) {
        if(root==null) {
            return 0;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offerLast(root);

        while (deque.size()>0) {
            TreeNode node = deque.pollLast();
            while (node.left!=null) {
                deque.offer(node.left);
                node = node.left;
            }
            if(node.right!=null) {
                deque.offer(node.right);
            }
            else {

            }
        }

        return 0;
    }

}
