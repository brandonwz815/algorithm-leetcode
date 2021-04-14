package nick.white;

public class Easy_876_MiddleOfTheLinkedList {

    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            return head.next;
        }

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next == null) {
            return slow;
        }
        if (fast.next.next == null) {
            return slow.next;
        }
        return null;
    }

}
