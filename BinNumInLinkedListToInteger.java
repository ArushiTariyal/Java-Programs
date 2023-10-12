

public class BinNumInLinkedListToInteger {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution {
        public static int getDecimalValue(ListNode head) {
            ListNode ptr = head;
            int count = -1;
            while(ptr!=null){
                count++;
                ptr= ptr.next;
            }
            ptr = head;
            int decimal = 0;
            while(count>=0){
                decimal += ((int) Math.pow(2,count--))*ptr.val;
                ptr = ptr.next;
            }
            return decimal;
        }
    }
    public static void main(String[] args){
        ListNode listNode1 = new ListNode(1,new ListNode(0, new ListNode(1,null)));
        ListNode listNode2 = new ListNode(0,null);
        System.out.println(Solution.getDecimalValue(listNode1));
        System.out.println(Solution.getDecimalValue(listNode2));
    }
}
