import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists_Heap_PQ_Method2 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Pair{
        ListNode node;
        int val;
        Pair(ListNode node, int val){
            this.node = node;
            this.val = val;
        }
    }
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
                public int compare(Pair a, Pair b){
                    return a.val - b.val;
                }

            });

            if(lists.length==0) return null;

            for(int i = 0; i<lists.length; i++){
                if(lists[i]!=null) pq.add(new Pair(lists[i], lists[i].val));
            }

            ListNode temp = new ListNode(-1);
            ListNode head = temp;

            while(!pq.isEmpty()){
                Pair p = pq.poll();
                if(p.node.next!=null) pq.add(new Pair(p.node.next, p.node.next.val));
                temp.next = p.node;
                temp = temp.next;
            }

            return head.next;

        }
    }
}
