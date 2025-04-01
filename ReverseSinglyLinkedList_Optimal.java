public class ReverseSinglyLinkedList_Optimal {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode mover = head;
            ListNode front = null;
            ListNode prev = null;
            while(mover!=null){
                front = mover.next;
                mover.next = prev;
                prev = mover;
                mover = front;
            }
            return prev;
        }
    }
}
