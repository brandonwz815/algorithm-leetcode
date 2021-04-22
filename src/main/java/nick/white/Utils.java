package nick.white;

public class Utils {

    public static TreeNode newTree() {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        System.out.printf("Before: %s\n ", root);
//        System.out.printf(" After: %s\n", );

        return null;
    }

    public static ListNode newList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        return null;
    }

}
