
public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        //         head    nexthead
        // null -> 1 ->     2  ->    3
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
    }
    return previous;
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
}