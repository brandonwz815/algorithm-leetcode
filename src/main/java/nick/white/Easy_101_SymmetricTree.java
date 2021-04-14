package nick.white;

import java.util.LinkedList;

/**
 * Not a recursive solution, as described by Nick
 * but rather an iterative solution
 * Took 16 minutes to code
 */
public class Easy_101_SymmetricTree {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode node) {
        if (node == null) return true;
        if (node.left == null && node.right != null) return false;
        if (node.left != null && node.right == null) return false;

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(node);

        LinkedList<TreeNode> children = new LinkedList<>();

        while (!nodes.isEmpty()) {
            TreeNode n = nodes.pollFirst();
            TreeNode n2 = nodes.pollLast();
            if (n == null && n2 == null) {
                continue;
            } else if ((n == null && n2 != null) || (n != null && n2 == null)) {
                return false;
            } else if (n.val != n2.val) {
                return false;
            } else {
                children.add(n.left);
                children.add(n.right);
            }

            if (nodes.isEmpty()) {
                nodes = children;
                children.clear();
            }
        }

        return true;
    }

}
