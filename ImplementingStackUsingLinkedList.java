public class ImplementingStackUsingLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedListStack {
        Node top;
        int size;
        public LinkedListStack() {
            size = 0;
            top = null;
        }

        public void push(int x) {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size++;
        }

        public int pop() {
            if(top==null) return -1;
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }

        public int top() {
            if(top==null) return -1;
            return top.data;
        }

        public boolean isEmpty() {
            return size==0;
        }
    }

}
