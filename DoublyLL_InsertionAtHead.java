public class DoublyLL_InsertionAtHead {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        Node(int data, Node next, Node prev) {
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
    public static Node insertHead(Node head, int val){
        Node temp = new Node(val,head,null);
        if(head==null) return temp;
        head.prev = temp;
        return temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = insertHead(head,0);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
