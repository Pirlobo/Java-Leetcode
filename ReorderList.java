public class ReorderList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        // node1.next.next.next.next = new ListNode(5);
        ListNode result = reorderList(node1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public static ListNode reorderList(ListNode head) {
        ListNode tempt = new ListNode(head.val);
        head = head.next;
        ListNode previous = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        ListNode ans = tempt;
        while(previous != null) {
            ans.next = previous;
            previous = previous.next;
            ans = ans.next;
        }
        return tempt;

    }
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
