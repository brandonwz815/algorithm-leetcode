package nick.white;

public class Medium_328_OddEvenLinkedList {

    public static void main(String[] args) {

    }

    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        if (head.next.next == null) {
            return head;
        }

        ListNode a = head;

        ListNode headNext = a.next;
        ListNode subList = a.next;

        while (a.next != null && a.next.next != null) {
            ListNode c = a.next.next;
            ListNode d = c.next;
            ListNode prev = a;
            a = c;
            subList.next = d;

        }

        a.next = subList;
        return head;
    }

}
