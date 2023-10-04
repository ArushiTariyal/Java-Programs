
public class LinkedListLL {
    Node head;
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node currNode = head;
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if(head == null) {
            System.out.println("Empty");
            return;
        }
        Node currNode = head;
        if(head.next == null) {
            head = null;
            return;
        }

        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public static void main(String[] args){
        LinkedListLL ll = new LinkedListLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.deleteLast();
        ll.printList();
        ll.addLast(3);
        ll.addLast(4);
        ll.deleteFirst();
        ll.printList();
    }
}