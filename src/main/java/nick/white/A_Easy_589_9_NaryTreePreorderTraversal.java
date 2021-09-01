package nick.white;

import util.Node;

import java.util.*;

public class A_Easy_589_9_NaryTreePreorderTraversal {

    public static void main(String[] args) {

//        Node node5 = new Node(5, Collections.emptyList());
//        Node node6 = new Node(6, Collections.emptyList());
//        List<Node> firstChildChildren = new ArrayList<>();
//        firstChildChildren.add(node5);
//        firstChildChildren.add(node6);
//
//        Node node3 = new Node(3, firstChildChildren);
//        Node node2 = new Node(2, Collections.emptyList());
//        Node node4 = new Node(4, Collections.emptyList());
//        List<Node> rootChildren = new ArrayList<>();
//        rootChildren.add(node3);
//        rootChildren.add(node2);
//        rootChildren.add(node4);
//
//        Node root = new Node(1, rootChildren);
//
//        System.out.printf("Before: %s\n ", root);
//        System.out.printf(" After: %s\n ", preorder(root).toString());
    }

    public static List<Integer> preorder(Node root) {
        if(root==null) {
            return Collections.emptyList();
        }

        List<Integer> output = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);

        while (deque.size()>0) {
            Node node = deque.pollLast();
            output.add(node.val);

            if(node.children.size()>0) {
                Collections.reverse(node.children); // !!!
                for(Node child: node.children) {
                    deque.offerLast(child);
                }
            }
        }
        return output;
    }

}
