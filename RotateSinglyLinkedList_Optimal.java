public class RotateSinglyLinkedList_Optimal {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null || k==0) return head;
            ListNode tail = head;
            int cnt = 1;
            while(tail.next!=null){
                tail = tail.next;
                cnt++;
            }
            k = k%cnt;
            if(k==0) return head;
            tail.next =head;

            ListNode temp = head;
            int lim = cnt-k;
            while(temp!=null){
                lim--;
                if(lim==0){
                    head = temp.next;
                    temp.next = null;
                    break;
                }
                temp = temp.next;
            }
            return head;
        }
    }
}
