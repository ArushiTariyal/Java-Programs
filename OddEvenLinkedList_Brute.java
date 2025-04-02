import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList_Brute {
      public class ListNode {
         int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next==null) return head;
            List<Integer> al = new ArrayList<>();
            ListNode temp = head;
            while(temp!=null&& temp.next!=null){
                al.add(temp.val);
                temp = temp.next.next;
            }
            if(temp!=null && temp.next==null) al.add(temp.val);
            temp = head.next;
            while(temp!=null && temp.next!=null){
                al.add(temp.val);
                temp = temp.next.next;
            }
            if(temp!=null && temp.next==null) al.add(temp.val);
            temp = head;
            int i = 0;
            while(temp!=null){
                temp.val = al.get(i);
                i++;
                temp = temp.next;
            }
            return head;
        }
    }
}
