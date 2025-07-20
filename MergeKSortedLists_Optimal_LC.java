import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists_Optimal_LC {
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
                }});
            if(lists==null || lists.length==0) return null;
            for(int i = 0; i<lists.length; i++){
                if(lists[i]!=null) pq.add(lists[i]);
            }

            ListNode temp = new ListNode(0);
            ListNode dummy = temp;
            while(pq.size()>0){
                ListNode node = pq.poll();
                temp.next = node;
                temp = temp.next;
                if(node.next != null){
                    pq.add(node.next);
                }

            }
            return dummy.next;
        }
    }
}
