class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x, ListNode2 next) {
        val = x;
        this.next = next;
    }
}

public class LinkedListCycle {
    public static void main(String[] args){
        ListNode2 l1 = new ListNode2(1, new ListNode2(2,( new ListNode2(3,(new ListNode2(3,( new ListNode2(4,null))))))));
        ListNode2 l2 = new ListNode2(2, new ListNode2(5,( new ListNode2(8,(new ListNode2(9,null))))));
        System.out.println(LinkedListCycle.hasCycle(l1));
        System.out.println(LinkedListCycle.hasCycle(l2));
    }
    public static boolean hasCycle(ListNode2 head) {
        if(head == null) return false;
        ListNode2 slow = head;
        ListNode2 fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
