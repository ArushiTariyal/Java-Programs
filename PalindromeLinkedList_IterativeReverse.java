public class PalindromeLinkedList_IterativeReverse {
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
            boolean ans = true;
            while(fast.next != null && fast.next.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            ListNode newHead = reverseLL(slow.next);
            ListNode second = newHead;
            ListNode first = head;
            while(second!=null){
                if(first.val != second.val){
                    ans = false;
                    break;
                }
                first= first.next;
                second = second.next;
            }
            reverseLL(newHead);
            return ans;
        }
        public static ListNode reverseLL(ListNode head){
            ListNode temp = head;
            ListNode front = null;
            ListNode prev= null;
            while(temp!=null){
                front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
            return prev;
        }
    }
}
