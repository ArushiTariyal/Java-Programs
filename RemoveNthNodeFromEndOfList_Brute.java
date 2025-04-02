public class RemoveNthNodeFromEndOfList_Brute {
      public class ListNode {
         int val;
          ListNode next;
         ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            int posn = count-n;
            if(posn==0){
                temp = head.next;
                head.next = null;
                return temp;
            }

            temp = head;
            posn--;
            while(posn>0){
                temp = temp.next;
                posn--;
            }

            ListNode removeNode = temp.next;
            if(temp.next!=null){
                temp.next = temp.next.next;
                removeNode.next = null;
            }
            else{
                temp.next = null;
            }
            return head;
        }
    }
}
