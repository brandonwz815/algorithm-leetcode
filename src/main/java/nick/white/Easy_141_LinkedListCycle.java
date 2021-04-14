package nick.white;

import java.util.HashSet;
import java.util.Set;

public class Easy_141_LinkedListCycle {

    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        Set<ListNode> set = new HashSet<>();
        set.add(head);

        while (head.next != null) {
            ListNode next = head.next;
            if (set.contains(next)) {
                return true;
            }
            set.add(next);
            head = next;
        }

        return false;
    }

}
