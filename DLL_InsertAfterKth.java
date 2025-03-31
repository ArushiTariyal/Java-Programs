public class DLL_InsertAfterKth {
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
            this.data= data;
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
    public static Node insertAfterK(Node head, int k, int val){
        if(head==null) return new Node(val);
        else if(k==1 && head.next==null) return insertAfterHead(head,val);
        else{
            Node prev = head;
            int cnt = 0;
            while(prev != null){
                cnt++;
                if(cnt==k) break;
                prev = prev.next;
            }
            if(cnt==k){
                if(prev.next==null) return insertAfterTail(head,val);
                else{
                    Node front = prev.next;
                    Node temp = new Node(val,front,prev);
                    prev.next = temp;
                    front.back = temp;
                }
            }
        }
        return head;
    }
    public static Node insertAfterHead(Node head, int val){
        if(head==null) return new Node(val);
        if(head.next==null){
            head.next= new Node(val,null,head);
        }
        return head;
    }
    public static Node insertAfterTail(Node head, int val){
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = new Node(val,null,tail);
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = insertAfterK(head,3,8); //k is the index (start = 1)
        Node mover = head;
        while(mover!=null){
            System.out.print(mover.data + " ");
            mover = mover.next;
        }
    }
}
