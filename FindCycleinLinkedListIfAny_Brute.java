import java.util.HashSet;

public class FindCycleinLinkedListIfAny_Brute {

    static class ListNode {
          int val;
         ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            HashSet<ListNode> visited = new HashSet<>();
            ListNode temp = head;
            while(temp!=null){
                if(visited.contains(temp)) return true;
                visited.add(temp);
                temp = temp.next;
            }
            return false;
        }
    }
}
