public class RotateSinglyLinkedList {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public static ListNode reverse(ListNode head){
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
        public ListNode rotateRight(ListNode head, int k) {
            if(head==null || head.next==null || k==0) return head;
            ListNode temp = head;
            ListNode head1 = null;
            ListNode head2 = null;
            int cnt = 0;
            while(temp!=null){
                cnt++;
                temp = temp.next;
            }
            k %= cnt;
            if(k==0) return head;
            ListNode last = head;
            ListNode first = reverse(head);
            temp = first;

            while(temp!=null){
                k--;
                if(k==0){
                    head1 = temp;
                    head2 = temp.next;
                    temp.next = null;
                    break;
                }
                temp = temp.next;
            }
            reverse(first);
            reverse(head2);
            first.next = last;
            return head1;
        }
    }
}
