public class Add1ToALinkedListNumber_Optimal {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    class Solution {
        public static Node reverse(Node head){
            Node temp = head;
            Node prev = null;
            Node front = null;
            while(temp!=null){
                front = temp.next;
                temp.next = prev;
                prev = temp;
                temp = front;
            }
            return prev;
        }
        public Node addOne(Node head) {
            // code here.
            if(head==null) return null;
            Node newHead = reverse(head);
            Node temp = newHead;
            int carry = 1;
            int keep = 0;
            int val = 0;
            while(temp!=null){
                val = temp.data + carry;
                keep = val%10;
                carry = val/10;
                temp.data = keep;
                if(carry==0) break;
                if(temp.next==null){
                    if(carry!=0){
                        temp.next = new Node(carry);
                    }
                    break;
                }
                temp = temp.next;
            }

            return reverse(newHead);
        }
    }

}
