package nick.white;

public class Medium_2_66_AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(4);

        System.out.printf(" After: %s\n", addTwoNumbers(l1, l2));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode mockNode = new ListNode(0);
        ListNode result = mockNode;
        int nextAdd = 0;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val + nextAdd;
            if (val > 9) {
                nextAdd = 1;
                result.next = new ListNode(val - 10);
            } else {
                nextAdd = 0;
                result.next = new ListNode(val);
            }
            l1 = l1.next;
            l2 = l2.next;
            result = result.next;
        }

        if (l1 == null && l2 != null) {
            result.next = l2;
        } else if (l1 != null && l2 == null) {
            result.next = l1;
        }

        return mockNode.next;
    }
}
