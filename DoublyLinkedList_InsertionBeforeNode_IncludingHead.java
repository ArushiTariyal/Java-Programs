public class DoublyLinkedList_InsertionBeforeNode_IncludingHead {
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
        Node head= new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node insertBeforeNode(Node head, int k, int val){
        if(head==null){
            return new Node(val);
        }
        else if(k==head.data){
            return insertionBeforeHead(head,val);
        }
        else if(head.next == null){ //k!=head.data and only 1 node
            return head;
        }
        else{  //middle insertion and tail insertion (before), FOR 2 OR MORE NODES
            Node front = head;
            while(front != null) {
                if (front.data == k) break;
                front = front.next;
            }
            if(front==null) return head;
            Node prev = front.back;
            Node temp = new Node(val,front,prev);
            prev.next = temp;
            front.back = temp;
        }
        return head;
    }
    public static Node insertionBeforeHead(Node head, int val){
        if(head==null) return new Node(val);
        Node temp = new Node(val,head,null);
        head.back = temp;
        return temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = insertBeforeNode(head,5,9);
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
