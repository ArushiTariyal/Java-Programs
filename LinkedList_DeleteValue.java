public class LinkedList_DeleteValue {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data= data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    private static Node deleteValue(Node head, int value){
        if(head.data == value){
            head = head.next;
            return head;
        }
        Node mover = head;
        Node prev = null;
        while(mover != null){
            if(mover.data ==value){
                prev.next = prev.next.next;
                break;
            }
            prev = mover;
            mover = mover.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,23,5,6,33,896,0,7};
        Node head = arrayToLL(arr);
        head = deleteValue(head,0);
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
