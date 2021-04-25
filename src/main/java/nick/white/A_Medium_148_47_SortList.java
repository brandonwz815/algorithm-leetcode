package nick.white;

public class A_Medium_148_47_SortList {

    public static void main(String[] args) {

    }

    public static ListNode sortList(ListNode head){
        if(head==null) {
            return null;
        }
        if(head.next==null) {
            return head;
        }
        if(head.next.next==null) {
            if(head.val>head.next.val) {
                return swap(null, head, head.next);
            }
            return head;
        }

        ListNode aPointer = null;
        ListNode bPointer = null;

//        while (true) {
//            ListNode mid = getMid(head);

//        }

return null;
    }

    private static ListNode swap(ListNode prev, ListNode head, ListNode next) {
        head.next = next.next;
        head = next;
        if(prev!=null) {
            prev.next = head;
        }
        return head;
    }
}
