public class FindMiddleOfLinkedList_Brute {
      static class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode middleNode(ListNode head) {
            int cnt = 0;
            ListNode temp = head;
            while(temp!=null){
                cnt++;
                temp = temp.next;
            }
            int midNodeIndex = cnt/2 + 1;
            temp = head;
            while(temp!=null){
                midNodeIndex--;
                if(midNodeIndex==0) break;
                temp = temp.next;
            }
            return temp;
        }
    }
}
