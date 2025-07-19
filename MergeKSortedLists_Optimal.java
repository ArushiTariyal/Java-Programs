import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists_Optimal {

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
            PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>(){
                public int compare(ListNode a, ListNode b){
                    return a.val - b.val;
                }
            }

            );
            for(int i = 0; i<heads.size(); i++){
                ListNode head = heads.get(i);
                pq.add(head);
            }

            ListNode temp = new ListNode(0);
            ListNode dummyHead = temp;

            while(pq.size()!=0){
                ListNode node = pq.poll();
                ListNode nxt = node.next;
                if(nxt != null){
                    pq.add(nxt);
                }
                temp.next = node;
                temp = temp.next;

            }
            return dummyHead.next;
        }
    }
}
