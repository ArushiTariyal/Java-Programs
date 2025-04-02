public class PalindromeLinkedList_RecursiveReverse {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while(fast.next != null && fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode newHead = reverseLL(slow.next);
            ListNode second = newHead;
            ListNode first = head;
            while(second!=null){
                if(first.val != second.val) return false;
                first= first.next;
                second = second.next;
            }
            return true;
        }
        public static ListNode reverseLL(ListNode head){
            if(head==null || head.next==null) return head;
            ListNode newHead = reverseLL(head.next);
            ListNode front = head.next;
            front.next = head;
            head.next = null;
            return newHead;
        }
    }
}
