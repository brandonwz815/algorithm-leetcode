package nick.white;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium_1019_102_NextGreaterNodeInLinkedList__ {

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.printf(" After: %s", Arrays.toString(nextLargestNodes(head)));
    }

    public static int[] nextLargestNodes(ListNode head) {
        List<Integer> result = new ArrayList<>();
        if (head.next == null) {
            result.add((head.val));
        } else {
            ListNode aPointer = head;
            ListNode bPointer = head.next;

            while (true) {
                if (bPointer == null) {
                    result.add(0);
                    if (aPointer.next == null) {
                        break;
                    } else {
                        aPointer = aPointer.next;
                        bPointer = aPointer.next;
                    }
                } else if (bPointer.val <= aPointer.val) {
                    bPointer = bPointer.next;
                } else {
                    result.add(bPointer.val);
                    if (aPointer.next == null) {
                        break;
                    } else {
                        aPointer = aPointer.next;
                        bPointer = aPointer.next;
                    }
                }
            }
        }

//        return result.toArray(new int[0]);
        return result.stream().mapToInt((Integer::intValue)).toArray();
    }
}
