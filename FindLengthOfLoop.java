public class FindLengthOfLoop {
    static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    class Solution {
        // Function to find the length of a loop in the linked list.
        public int countNodesinLoop(Node head) {
            // Add your code here.
            Node fast = head;
            Node slow = head;
            int cnt = 0;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                cnt++;
                if (slow == fast) return cnt;
            }
            return 0;
        }
    }
}
