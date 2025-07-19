import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists_LinkedList_Heaps {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }


    class Solution {
        public ListNode mergeKSortedLists(List<ListNode> heads) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i = 0; i<heads.size(); i++){
                ListNode head = heads.get(i);
                while(head!=null){
                    pq.add(head.val);
                    head = head.next;
                }
            }
            ListNode hd = new ListNode(pq.poll());
            ListNode ptr = hd;
            while(pq.size()!=0){
                ListNode nd = new ListNode(pq.poll());
                ptr.next = nd;
                ptr = ptr.next;
            }
            return hd;
        }
    }
}
