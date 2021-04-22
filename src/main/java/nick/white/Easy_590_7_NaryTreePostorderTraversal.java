package nick.white;

import java.util.*;

public class Easy_590_7_NaryTreePostorderTraversal {

    public static void main(String[] args) {

        Node node5 = new Node(5, Collections.emptyList());
        Node node6 = new Node(6, Collections.emptyList());
        List<Node> firstChildChildren = new ArrayList<>();
        firstChildChildren.add(node5);
        firstChildChildren.add(node6);

        Node node3 = new Node(3, firstChildChildren);
        Node node2 = new Node(2, Collections.emptyList());
        Node node4 = new Node(4, Collections.emptyList());
        List<Node> rootChildren = new ArrayList<>();
        rootChildren.add(node3);
        rootChildren.add(node2);
        rootChildren.add(node4);

        Node root = new Node(1, rootChildren);

        System.out.printf("Before: %s\n ", root);
        System.out.printf(" After: %s\n ", postorder(root).toString());

    }

    public static List<Integer> postorder(Node root) {
        List<Integer> output = new ArrayList<>();

        if (root == null) {
            return null;
        }
        if (root.children.size() == 0) {
            output.add(root.val);
            return output;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.offerLast(root);

        while (deque.size() > 0) {
            Node node = deque.pollLast();

//            if (node.children.isEmpty()) {
//                output.add(node.val);
//            } else {
//                deque.offerLast(node);
//                Collections.reverse(node.children);
//                for (Node child : node.children) {
//                    deque.offerLast(child);
//                }
//            }

            output.add(node.val);

            for(Node child : node.children) {
                deque.offerLast(child);
            }
        }

        Collections.reverse(output); // !!!
        return output;
    }
}
