public class DeleteMidNodeFromSinglyLL_Brute {
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
            ListNode temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            int lim = count/2;
            temp =head;
            while(temp!=null){
                lim--;
                if(lim==0) break;
                temp = temp.next;
            }
            ListNode del = temp.next;
            temp.next = temp.next.next;
            del.next = null;
            return head;
        }
    }
}
