public class RemoveNthNodeFromEndOfLinkedLinkedList_Optimal_2Pointer {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            while(n!=0){
                fast = fast.next;
                n--;
            }
            if(fast==null){
                ListNode newHead = head.next;
                head.next = null;
                return newHead;
            }
            ListNode slow = head;
            while(fast.next!=null){
                fast = fast.next;
                slow = slow.next;
            }
            ListNode removeNode = slow.next;
            slow.next = slow.next.next;
            removeNode.next = null;
            return head;
        }
    }
}
