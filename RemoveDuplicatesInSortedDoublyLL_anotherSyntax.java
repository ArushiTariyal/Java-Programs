public class RemoveDuplicatesInSortedDoublyLL_anotherSyntax {
    class Node{
        int data;
        Node next, prev;
        Node(int x){
            this.data = x;
            this.next = null;
            this.prev = null;
        }
    }

    class Solution{
        Node removeDuplicates(Node head){
            // Code Here.
            if(head==null || head.next ==null) return head;
            Node temp = head;
            while(temp!=null){
                Node front = temp.next;
                while(front!=null && front.data == temp.data){
                    front = front.next;
                }
                temp.next = front;
                if(front!=null) front.prev= temp;
                temp = front;
            }
            return head;
        }
    }
}
