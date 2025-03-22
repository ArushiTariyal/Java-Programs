public class DoubleLinkedList_Creation {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
            this.prev = null;
        }
    }
    private static Node arrayToDoublyLL(int[] arr){
        Node head = new Node(arr[0],null,null);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToDoublyLL(arr);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }

    }
}
