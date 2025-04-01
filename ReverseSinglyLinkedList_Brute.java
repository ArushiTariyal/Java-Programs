import java.util.Stack;
public class ReverseSinglyLinkedList_Brute {
    public class ReverseSinglyLinkedList_Optimal {
        public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

        class Solution {
            public ListNode reverseList(ListNode head) {
               Stack<Integer> st = new Stack<>();
               ListNode temp = head;
               while(temp!=null){
                   st.push(temp.val);
                   temp = temp.next;
               }
               temp = head;
               while(temp!=null){
                   temp.val = st.pop();
                   temp = temp.next;
               }
               return temp;
            }
        }
    }

}
