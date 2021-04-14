package nick.white;

public class Easy_21_MergeTwoSortedLists {

    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode m = null;
        if (l1.val <= l2.val) {
            m = l1;
            l1 = l1.next;
        } else {
            m = l2;
            l2 = l2.next;
        }

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                m.next = l1;
                l1 = l1.next;
            } else {
                m.next = l2;
                l2 = l2.next;
            }
            m = m.next;
        }

        if (l1.next != null) {
            m.next = l1;
        } else if (l2.next != null) {
            m.next = l2;
        }
        return m;
    }

}
