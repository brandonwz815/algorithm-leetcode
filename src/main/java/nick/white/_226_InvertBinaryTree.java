package nick.white;

import java.util.LinkedList;

public class _226_InvertBinaryTree {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode invertTree2(TreeNode root) {

        if (root == null) {
            return null;
        }

        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            nodes.push(node.right);
            nodes.push(node.left);
        }
        return root;
    }

}
