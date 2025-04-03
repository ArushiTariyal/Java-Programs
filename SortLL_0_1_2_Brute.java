public class SortLL_0_1_2_Brute {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    class Solution {
        // Function to sort a linked list of 0s, 1s and 2s.
        static Node segregate(Node head) {
            //BRUTE
            if(head==null || head.next==null) return head;
            Node temp = head;
            int cnt0=0, cnt1=0,cnt2=0;
            while(temp!=null){
                if(temp.data == 0) cnt0++;
                else if(temp.data == 1) cnt1++;
                else cnt2++;
                temp  = temp.next;
            }
            temp = head;
            while(cnt0 != 0){
                temp.data = 0;
                temp = temp.next;
                cnt0--;
            }
            while(cnt1!=0){
                temp.data = 1;
                temp = temp.next;
                cnt1--;
            }
            while(cnt2!=0){
                temp.data = 2;
                temp = temp.next;
                cnt2--;
            }
            return head;

        }
    }
}
