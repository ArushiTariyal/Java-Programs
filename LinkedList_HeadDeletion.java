public class LinkedList_HeadDeletion {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    private static Node convertArrtoLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i= 1; i<arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return  head;
    }
    private static Node deleteHead(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = convertArrtoLL(arr);
        head = deleteHead(head);
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
