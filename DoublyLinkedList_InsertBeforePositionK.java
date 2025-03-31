public class DoublyLinkedList_InsertBeforePositionK {
    static class Node {
        int data;
        Node next;
        Node back;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }

        Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }
    }

    public static Node arrayToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node insertBeforeKPosn(Node head, int k, int val) {
        if (k == 1) return insertBeforeHead(head, val);
        else if (head == null) return new Node(val);
        else if (k < 1) return head;
        else {
            Node mover = head;
            int count = 0;
            while (mover != null) {
                count++;
                if (count == k) break;
                mover = mover.next;
            }
            if (count == k) {
                if (mover.next == null) return insertBeforeTail(head, val);
                else {
                    Node prev = mover.back;
                    Node temp = new Node(val, mover, prev);
                    prev.next = temp;
                    mover.back = temp;
                }
            }
        }
        return head;
    }

    public static Node insertBeforeHead(Node head, int val) {
        if (head == null) return new Node(val);
        Node temp = new Node(val, head, null);
        head.back = temp;
        return temp;
    }

    public static Node insertBeforeTail(Node head, int val) {
        if (head == null) return new Node(val);
        if (head.next == null) {
            Node temp = new Node(val, head, null);
            head.back = temp;
            return temp;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        Node temp = new Node(val, tail, prev);
        prev.next = temp;
        tail.back = temp;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = arrayToLL(arr);
        head = insertBeforeKPosn(head, 5, 9);
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " ");
            mover = mover.next;
        }

    }
}
