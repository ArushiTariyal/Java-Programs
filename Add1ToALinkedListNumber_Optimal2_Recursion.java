public class Add1ToALinkedListNumber_Optimal2_Recursion {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }
    
    class Solution {
        public static int recursionLL(Node head){
            if(head==null) return 1;
            int carry = recursionLL(head.next);
            if(carry==0) return 0;
            int val = head.data + carry;
            if(val<10){
                head.data = val;
                return 0;
            }

            head.data = 0;
            return 1;

        }
        public Node addOne(Node head) {
            // code here.
            int carry = recursionLL(head);
            if(carry==1){
                Node temp = new Node(1);
                temp.next = head;
                head = temp;
            }
            return head;
        }
    }

}
