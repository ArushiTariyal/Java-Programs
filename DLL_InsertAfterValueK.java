public class DLL_InsertAfterValueK {
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
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i],null,mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node insertAfterNodValue(Node head, int k, int val){
        if(head==null) return new Node(val);
        if(k==1) return insertAfterHead(head,val);
        else{
            Node prev = head;
            while(prev != null){
                if(prev.data ==k) break;
                prev = prev.next;
            }
            if(prev==null) return head;
            if(prev.next==null) return insertAfterTail(head,val);
            Node front = prev.next;
            Node temp = new Node(val,front,prev);
            front.back = temp;
            prev.next= temp;
        }
        return head;
    }
    public static Node insertAfterHead(Node head, int val){
        if(head==null) return new Node(val);
        if(head.next==null){
            head.next = new Node(val,null,head);
            return head;
        }
        Node front = head.next;
        Node temp = new Node(val,front,head);
        head.next= temp;
        front.back = temp;
        return head;
    }
    public static Node insertAfterTail(Node head, int val){
        Node tail = head;
        while(tail.next!=null) tail = tail.next;
        tail.next = new Node(val,null,tail);
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12,4,5,3,56};
        Node head = arrayToLL(arr);
        head = insertAfterNodValue(head,5,99); //k is the data in node
        Node mover = head;
        while(mover != null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
