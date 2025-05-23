import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortSinglyLL_Brute {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode sortList(ListNode head) {
            if(head==null || head.next==null) return head;
            List<Integer> al = new ArrayList<>();
            ListNode temp = head;
            while(temp!=null){
                al.add(temp.val);
                temp = temp.next;
            }
            Collections.sort(al);
            temp = head;
            int i = 0;
            while(temp!=null){
                temp.val = al.get(i++);
                temp = temp.next;
            }
            return head;
        }
    }
}
