package nick.white;

public class Medium_24_36_SwapNodesInPairs__ {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.printf("Before swap, nodes are %s\n", head);
        System.out.printf(" After swap, nodes are %s\n", swapPairs(head));
    }

    private static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;

        ListNode currentHead = head;
        ListNode nextPrev = new ListNode(0);
        while (currentHead != null && currentHead.next != null) {
            ListNode nextCurrentHead = currentHead.next.next;

            // swap
            ListNode next = currentHead.next;

            nextPrev.next = next;

            next.next = currentHead;
            currentHead.next = nextCurrentHead;

            nextPrev = currentHead;
            currentHead = nextCurrentHead;
        }

        return second;
    }

}
