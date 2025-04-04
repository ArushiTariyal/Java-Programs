import java.util.HashMap;

public class CopyLinkedListWithRandomPointer_Brute {
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
            if(head==null) return null;
            HashMap<Node,Node> hm = new HashMap<>();
            Node temp =head;
            while(temp!=null){
                hm.put(temp,new Node(temp.val));
                temp = temp.next;
            }
            temp = head;
            Node newHead = hm.get(temp);
            while(temp!=null){
                Node mover = hm.get(temp);
                mover.next = hm.get(temp.next);
                mover.random = hm.get(temp.random);
                temp = temp.next;
            }
            return newHead;
        }
    }
}
