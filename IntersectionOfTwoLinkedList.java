
public class IntersectionOfTwoLinkedList {
    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x, ListNode next) {
              this.val = x;
              this.next = null;
          }
    }

    public class Solution {
        public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode ptrA = headA;
            ListNode ptrB = headB;
            while(ptrA!=ptrB){
                ptrA = (ptrA==null)? headB : ptrA.next;
                ptrB = (ptrB==null)? headA : ptrB.next;
            }
            return ptrA;
        }
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1,new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(0, null)))));
        ListNode l2 = new ListNode(8,new ListNode(5,new ListNode(6, new ListNode(2, new ListNode(5, new ListNode(0,null))))));
        ListNode head = Solution.getIntersectionNode(l1,l2);
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("null");
    }
}
