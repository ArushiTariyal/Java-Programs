public class CopyLinkedListWithRandomPointer_Optimal {
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


    class Solution {
        public Node copyRandomList(Node head) {
            Node temp = head;
            while(temp!=null){
                Node mover = new Node(temp.val);
                mover.next = temp.next;
                temp.next = mover;
                temp = temp.next.next;
            }
            temp = head;
            while(temp!=null){

                if(temp.random==null){
                    temp.next.random = null;
                }
                else{
                    temp.next.random = temp.random.next;
                }
                temp = temp.next.next;
            }
            Node dummy = new Node(-1);
            Node res = dummy;
            temp = head;
            while(temp!=null){
                res.next = temp.next;
                temp.next = temp.next.next;
                temp = temp.next;
                res = res.next;
            }
            return dummy.next;
        }
    }
}
