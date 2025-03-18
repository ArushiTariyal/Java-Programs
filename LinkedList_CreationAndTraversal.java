class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList_CreationAndTraversal {
    public static Node Array2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node mover = Array2LL(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(mover.data+ " ");
            mover= mover.next;
        }
    }
}
