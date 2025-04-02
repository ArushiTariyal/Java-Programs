public class SortSinglyLinkedList_Optimal_MergeSort {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public static ListNode findMiddle(ListNode head){
            ListNode fast = head.next;  //can do head.next.next also
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        public ListNode MergeSort(ListNode lefthead, ListNode righthead){
            ListNode tempHead = new ListNode(-1);
            ListNode mover = tempHead;
            ListNode left = lefthead, right = righthead;
            while(left!=null && right!=null){
                if(left.val<=right.val){
                    mover.next = left;
                    mover = left;
                    left = left.next;
                }
                else{
                    mover.next = right;
                    mover = right;
                    right = right.next;
                }
            }
            if(left!=null) mover.next = left; //because these are ll, when you join mover with left and if left has many nodes left, it will automatically join with all, as the nodes of left are linked to each other due to being linked list

            if(right!=null) mover.next = right;

            // while(left!=null){        //thus, these while loops are not needed
            //     mover.next = left;
            //     mover = left;
            //     left = left.next;
            // }
            // while(right!=null){
            //     mover.next= right;
            //     mover = right;
            //     right = right.next;
            // }
            return tempHead.next;
        }
        public ListNode sortList(ListNode head) {
            if(head==null || head.next==null) return head;
            ListNode middle = findMiddle(head);
            ListNode left = head;
            ListNode right = middle.next;
            middle.next = null;
            ListNode lefthead = sortList(left);
            ListNode righthead = sortList(right);
            return MergeSort(lefthead,righthead);
        }
    }
}
