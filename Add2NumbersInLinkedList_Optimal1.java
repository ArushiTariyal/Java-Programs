public class Add2NumbersInLinkedList_Optimal1 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if(l1==null) return l2;
            if(l2==null) return l2;
            ListNode temp1 = l1;
            ListNode temp2 = l2;

            ListNode dummyHead  = new ListNode(-1);
            ListNode curr = dummyHead;

            int carry = 0;
            int sum = 0;
            int keep = 0;

            while(temp1!=null && temp2!=null){
                sum = temp1.val + temp2.val + carry;
                carry = sum/10;
                keep = sum%10;
                curr.next = new ListNode(keep);
                curr = curr.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            while(temp2!=null){
                sum = temp2.val + carry;
                carry = sum/10;
                keep = sum%10;
                curr.next = new ListNode(keep);
                curr = curr.next;
                temp2 = temp2.next;
            }
            while(temp1!=null){
                sum = temp1.val + carry;
                carry = sum/10;
                keep = sum%10;
                curr.next = new ListNode(keep);
                curr = curr.next;
                temp1 = temp1.next;
            }
            if(carry!=0){
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }
    }
}
