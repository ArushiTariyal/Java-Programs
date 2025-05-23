public class DeleteMidNodeFromSinglyLL_Optimal_TwoPointer {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if(head==null || head.next==null) return null;
            ListNode fast = head.next.next;
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode delete = slow.next;
            slow.next = slow.next.next;
            delete.next = null;
            return head;
        }
    }
}
