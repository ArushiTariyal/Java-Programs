public class ImplementingQueueUsingLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedListQueue {
        int size;
        Node start;
        Node end;
        public LinkedListQueue() {
            size = 0;
            start = null;
            end = null;
        }

        public void push(int x) {
            Node temp = new Node(x);
            if(end==null){
                start=end=temp;
            }
            else{
                end.next = temp;
                end = temp;
            }
            size++;
        }

        public int pop() {
            if(size==0) return -1;
            int val = start.data;
            start = start.next;
            if(start==null) end=null;
            size--;
            return val;
        }

        public int peek() {
            if(size==0) return -1;
            return start.data;
        }

        public boolean isEmpty() {
            return size==0;
        }
    }

}
