package nick.white;

public class Medium_86_38_PartitionList__ {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        System.out.printf("Before partition: %s\n", head);

        System.out.printf(" After partition: %s\n", partition(head, 3));
    }

    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode firstLeftHead = null;
        ListNode firstRightHead = null;

        ListNode leftHead = null;
        ListNode rightHead = null;

        while (head != null) {
            if (head.val < x) {
                if (leftHead == null) {
                    leftHead = head;
                    firstLeftHead = head;
                } else {
                    leftHead.next = head;
                    leftHead = leftHead.next;
                }
            } else {
                if (rightHead == null) {
                    rightHead = head;
                    firstRightHead = head;
                } else {
                    rightHead.next = head;
                    rightHead = rightHead.next;
                }
            }
            head = head.next;
//            if(leftHead!=null) leftHead.next=null;
//            if(rightHead!=null) rightHead.next=null;
        }

        if (leftHead == null) {
            return firstRightHead;
        } else {
            rightHead.next = null;
            leftHead.next = firstRightHead;
            return firstLeftHead;
        }
    }

}
