public class DeleteAllOccurencesOfKeyInDLL {
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            next = prev = null;
        }
    }
    class Solution {
        static Node deleteAllOccurOfX(Node head, int x) {
            // Write your code here
            if(head==null) return null;
            Node temp = head;
            Node last = null;
            Node front = null;

            while(temp!=null){
                if(temp.data == x){
                    if(temp==head) head = head.next;
                    last = temp.prev;
                    front = temp.next;
                    if(last !=null) last.next = front;
                    if(front !=null) front.prev = last;
                    temp.next = null;
                    temp.prev = null;
                    temp = front;

                }
                else temp = temp.next;
            }
            return head;
        }
    }
}
