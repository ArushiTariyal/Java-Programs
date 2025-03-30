public class DoublyLinkedList_DeleteNodeK {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data= data;
            this.next = null;
            this.prev = null;
        }
        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
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
    public static Node deleteNodeK(Node head, Node k){
        if(head==null || head.next==null) return null;
        Node back = k.prev;
        Node front = k.next;
        if(back==null){
            front.prev = null;
            k.next= null;
            head = front;
        }
        else if(front==null){
            k.prev = null;
            back.next = null;
        }
        else{
            back.next = front;
            front.prev = back;
            k.prev = null;
            k.next = null;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = deleteNodeK(head,head);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data+ " ");
            mover = mover.next;
        }

    }
}
