public class ReverseNodesInKthGroup_SinglyLL_Optimal {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public static ListNode findKthNode(ListNode head, int k){
            ListNode kth = head;
            while(k!=1){
                kth = kth.next;
                if(kth==null) return null;
                k--;
            }
            return kth;
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
            return head;
        }
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode temp = head;
            ListNode prev= null;

            while(temp!=null){
                ListNode kth = findKthNode(temp,k);
                if(kth==null){
                    if(prev!=null) prev.next = temp;
                    break;
                }
                ListNode nextNode = kth.next;
                kth.next = null;
                reverseLL(temp);
                if(temp==head) head = kth;
                else prev.next = kth;
                prev = temp;
                temp = nextNode;
            }
            return head;
        }
    }
}
