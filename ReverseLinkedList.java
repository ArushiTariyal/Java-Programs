public class ReverseLinkedList {
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val,ListNode next){
            this.next = next;
            this.val = val;
        }
        public ListNode(){}
        public ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printLL(ListNode head){
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args){
       printLL(reverseLinkedList(new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))))));
       printLL(reverseLinkedList(null));


    }
}
