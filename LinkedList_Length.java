
public class LinkedList_Length {
    static class Node{
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
    public static int countLengthofLL(Node head){
        int count = 0;
        Node mover = head;
        while(mover != null){
            count++;
            mover = mover.next;
        }
        return count;
    }
    public static Node linkedListCreation(int[] arr){
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
        int[] arr = {1,2,3,4,5,34,63,74,743,74,26,9,6,0,4};
        Node head = linkedListCreation(arr);
        System.out.println(countLengthofLL(head));
    }
}
