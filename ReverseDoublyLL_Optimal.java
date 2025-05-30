public class ReverseDoublyLL_Optimal {
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
            if(head==null || head.next==null) return head;
            DLLNode current = head;
            DLLNode last = null;
            while(current!=null){
                last = current.prev;
                current.prev = current.next;
                current.next = last;
                current = current.prev;
            }
            return last.prev;
        }
    }

}
