package nick.white;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class A_Medium_114_44_FlattenBinaryTreeToLinkedList {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.printf("Before: %s\n ", root);
        flatten(root);
        System.out.printf(" After: %s\n", root);

    }

    public static void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

//        TreeNode nextNode = root.left;
//        if (nextNode == null) {
//            nextNode = root.right;
//        }
        // preorder traversal
        Deque<TreeNode> deque = new ArrayDeque<>();

        if (root.right != null) {
            deque.offerLast(root.right);
        }
        if (root.left != null) {
            deque.offerLast(root.left);
        }

        TreeNode currentNode = null;
//        deque.offerLast(currentNode);
        while (deque.size() > 0) {
            TreeNode node = deque.pollLast();
            if (node.right != null) {
                deque.offerLast(node.right);
            }
            if (node.left != null) {
                deque.offerLast(node.left);
            }
            if(currentNode==null) {
                currentNode = root;
            } else {
                currentNode.right = node;
                currentNode = currentNode.right;
            }
        }
    }
}
