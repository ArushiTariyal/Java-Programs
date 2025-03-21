public class LinkedList_TailInsertion {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data =data;
            this.next = null;
        }
    }
    private static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node tailInsertion(Node head, int val){
        Node mover = head;
        while(mover.next != null){
            mover = mover.next;
        }
        mover.next = new Node(val);
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = tailInsertion(head,6);
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
