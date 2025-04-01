import java.util.HashSet;

public class LinkedListCycleII_Optimal {
        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return detectNode(head,slow,fast);
        }
        return null;
    }
    public static ListNode detectNode(ListNode head, ListNode slow, ListNode fast){
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
