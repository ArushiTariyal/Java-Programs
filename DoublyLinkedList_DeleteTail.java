public class DoublyLinkedList_DeleteTail {
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
            this.data =data;
            this.next = next;
            this.back = back;
        }
    }
    public static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0],null, null);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteTail(Node head){
        if(head==null||head.next ==null){
            return null;
        }
        Node mover = head;
        while(mover.next!=null){
            mover = mover.next;
        }
        Node prev = mover.back;
        mover.back = null;
        prev.next = null;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = deleteTail(head);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
