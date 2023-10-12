public class MiddleOfLInkedList {

      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    static class Solution {
        public static ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null&&fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }
    public static void main(String[] args){
          ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
          ListNode l2 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
          printLL(Solution.middleNode(l1));
          printLL(Solution.middleNode(l2));

    }
    public static void printLL(ListNode slow){
          while(slow!=null){
              System.out.print(slow.val+" ");
              slow = slow.next;
          }
        System.out.println();
    }
}
