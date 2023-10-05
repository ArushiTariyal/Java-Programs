
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution12 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode currNode = head;
        while(list1 != null && list2!=null){
            if(list1.val<=list2.val){
                currNode.next = list1;
                list1 = list1.next;
            }
            else{
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }
        if(list1!=null){
            currNode.next = list1;

        }
        if(list2!= null){
            currNode.next = list2;
        }
        return head.next;
    }
}
public class MergeTwoSortedLinkedList {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1, new ListNode(2,( new ListNode(3,(new ListNode(3,( new ListNode(4,null))))))));
        ListNode l2 = new ListNode(2, new ListNode(5,( new ListNode(8,(new ListNode(9,null))))));
        Solution12 sol = new Solution12();
        ListNode ptr = sol.mergeTwoLists(l1,l2);
        while(ptr!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }

}
