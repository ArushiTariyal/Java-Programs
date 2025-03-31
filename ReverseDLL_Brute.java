import java.util.Stack;

public class ReverseDLL_Brute {
    class DLLNode {
        int data;
        DLLNode next;
        DLLNode prev;

        DLLNode(int val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    class Solution {
        public DLLNode reverseDLL(DLLNode head) {
            // Your code here
            Stack<Integer> st = new Stack<Integer>();
            if(head==null || head.next==null) return head;
            DLLNode mover = head;
            while(mover != null){  //creating stack
                st.push(mover.data);
                mover = mover.next;
            }
            DLLNode temp = head;
            while(temp!=null){
                temp.data = st.pop();
                temp = temp.next;
            }
            return head;
        }
    }
}
