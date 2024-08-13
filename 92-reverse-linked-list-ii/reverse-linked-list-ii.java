public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) return null;

      
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }


        ListNode t1 = prev.next;
        ListNode t2 = t1.next;

     
        for (int i = 0; i < n - m; i++) {
            t1.next = t2.next;
            t2.next = prev.next;
            prev.next = t2;
            t2 = t1.next;
        }

        return dummy.next;
    }
}