import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists_Heap_PQ_Method1 {

      public class ListNode {
          int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
                public int compare(ListNode a, ListNode b){
                    return a.val - b.val;
                }
            });

            if(lists.length==0) return null;

            for(int i = 0; i<lists.length; i++){
                if(lists[i]!=null) pq.add(lists[i]);
            }

            ListNode temp = new ListNode(-1);
            ListNode head = temp;

            while(!pq.isEmpty()){
                ListNode node = pq.poll();
                if(node.next!=null) pq.add(node.next);
                temp.next = node;
                temp = temp.next;
            }

            return head.next;

        }
    }
}
