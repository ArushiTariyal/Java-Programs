public class RemoveDuplicatesInSortedDoublyLL {
    class Node {
        int data;
        Node next, prev;

        Node(int x) {
            this.data = x;
            this.next = null;
            this.prev = null;
        }

        class Solution {
            Node removeDuplicates(Node head) {
                // Code Here.
                if (head == null || head.next == null) return head;
                Node temp = head;
                Node front = head.next;

                while (front != null) {
                    if (front.data != temp.data) {
                        temp.next = front;
                        front.prev = temp;
                        temp = temp.next;
                    }
                    front = front.next;
                }
                temp.next = front;
                return head;
            }
        }
    }
}
