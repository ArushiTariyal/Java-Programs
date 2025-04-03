public class IntersectionOfTwoLinkedLists_Optimal {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null || headB==null) return null;
            ListNode tempA = headA;
            ListNode tempB = headB;
            int len1 = 0, len2 = 0;
            while(tempA!=null){
                len1++;
                tempA = tempA.next;
            }
            while(tempB!=null){
                len2++;
                tempB = tempB.next;
            }
            int diff = Math.abs(len2-len1);
            tempB = headB;
            tempA = headA;
            if(len2>len1){

                while(diff!=0){
                    tempB = tempB.next;
                    diff--;
                }
            }
            else{
                while(diff!=0){
                    tempA = tempA.next;
                    diff--;
                }
            }

            while(tempA != null && tempB !=null){
                if(tempA==tempB) return tempA;
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return null;
        }
    }
}
