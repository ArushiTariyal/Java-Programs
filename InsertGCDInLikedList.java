public class InsertGCDInLikedList {
    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    static class Solution {
        public static ListNode insertGreatestCommonDivisors(ListNode head) {
            if(head==null) return head;
            ListNode curr = head;
            ListNode next = curr.next;
            while(next!=null){
                ListNode temp = new ListNode(gcd(curr.val,next.val),null);
                curr.next = temp;
                temp.next = next;
                curr = next;
                next = next.next;
            }
            return head;
        }
        public static int gcd(int a, int b){
            while(a!=b){
                if(a>b) a=a-b;
                else b = b-a;
            }
            return a;
        }
    }
    public static void main(String[] args){
        ListNode l = new ListNode(6,new ListNode(18, new ListNode(19,new ListNode(36, new ListNode(64,null)))));
        ListNode head = Solution.insertGreatestCommonDivisors(l);
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println("null");
    }
}
