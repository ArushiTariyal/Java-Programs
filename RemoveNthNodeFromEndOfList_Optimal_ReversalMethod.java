public class RemoveNthNodeFromEndOfList_Optimal_ReversalMethod {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head==null) return head;
            ListNode newHead = reverseLL(head);
            if(n==1){
                ListNode temp = newHead.next;
                newHead.next = null;
                return reverseLL(temp);
            }
            ListNode temp = newHead;
            n = n-2; //for 3rd take 1, for 2nd take 0
            while(temp!=null){
                if(n==0){
                    ListNode removeNode = temp.next;
                    temp.next = temp.next.next;
                    removeNode.next = null;
                    break;
                }
                temp = temp.next;
                n--;
            }
            return reverseLL(newHead);
        }
        public static ListNode reverseLL(ListNode head){
            ListNode temp = head;
            ListNode prev = null;
            ListNode front = null;
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
