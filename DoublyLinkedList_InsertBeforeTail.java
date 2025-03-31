public class DoublyLinkedList_InsertBeforeTail {
    static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.next = null;
            this.back = null;
        }

        Node(int data, Node next, Node back){
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }
    public static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node insertBeforeTail(Node head, int k){
        Node temp = new Node(k,null,null);
        if(head==null) return temp;
        if(head.next==null){
            temp.next = head;
            head.back = temp;
            return temp;
        }
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next = temp;
        tail.back = temp;
        temp.next = tail;
        temp.back = prev;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = insertBeforeTail(head,9);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
