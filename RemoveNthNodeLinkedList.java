public class RemoveNthNodeLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode left = dummy_head;
        ListNode right = dummy_head;
        
        for(int i = 1 ; i <= n + 1; i++){
            right = right.next;
        }
        
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
        
        return dummy_head.next;
    }
}
