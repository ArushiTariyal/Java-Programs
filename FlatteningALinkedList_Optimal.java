public class FlatteningALinkedList_Optimal {
    static class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }
    class Solution {
        // Function to flatten a linked list
        Node flatten(Node root) {
            // code here
            if(root==null || root.next == null) return root;
            Node mergedHead = flatten(root.next);
            return merge(root,mergedHead);
        }
        public static Node merge(Node head1, Node head2){
            Node dummy = new Node(-1);
            Node mover = dummy;
            Node t1 = head1, t2 = head2;
            while(t1!=null && t2!=null){
                if(t1.data < t2.data){
                    mover.bottom = t1;
                    mover = mover.bottom;
                    t1 = t1.bottom;
                }
                else{
                    mover.bottom = t2;
                    mover = mover.bottom;
                    t2 = t2.bottom;
                }
            }
            if(t1!=null) mover.bottom = t1;
            if(t2!=null) mover.bottom = t2;
            return dummy.bottom;
        }
    }

}
