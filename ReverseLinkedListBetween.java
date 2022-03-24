public class ReverseLinkedListBetween {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode currentNode = head;
        while (left > 1) {
            prev = currentNode;
            currentNode = currentNode.next;
            left--;
            right--;
        }
        ListNode connection = prev;
        ListNode tail = currentNode;

        while(right > 0) {
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            head = nextNode;
            right--;
        }
        if (connection != null) {
            connection.next = prev;
        }
        else {
            head = prev;
        }
        tail.next = currentNode;
        return head;
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
