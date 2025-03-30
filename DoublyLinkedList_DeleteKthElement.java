public class DoublyLinkedList_DeleteKthElement {
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
        Node head = new Node(arr[0],null,null);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteKth(Node head, int k){
        if(k<=0) return head;
        if(head==null) return null;
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp = temp.next;
        }
        if(count<k) return head;
        Node prev = temp.back;
        Node front = temp.next;
        if(prev==null && front == null) return null;
        else if(prev==null){
            front.back = null;
            temp.next = null;
            head = front;
        }
        else if(front ==null){
            prev.next = null;
            temp.back = null;
        }
        else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = deleteKth(head,4);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
