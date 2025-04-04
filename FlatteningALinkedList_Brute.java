import java.util.*;
public class FlatteningALinkedList_Brute {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int x) {
            data = x;
            next = null;
            bottom = null;
        }
    }

    class Solution {
        // Function to flatten a linked list
        Node flatten(Node root) {
            // code here
            //BRUTE
            ArrayList<Integer> al = new ArrayList<>();
            Node temp = root;
            while(temp!=null){
                Node t2 = temp;
                while(t2!=null){
                    al.add(t2.data);
                    t2 = t2.bottom;
                }
                temp = temp.next;
            }
            int size = al.size();
            if(size==0) return root;
            Collections.sort(al);
            Node head = new Node(al.get(0));
            temp = head;
            int i = 1;
            while(i<size){
                Node newNode = new Node(al.get(i));
                temp.bottom = newNode;
                temp = newNode;
                i++;
            }
            return head;
        }
    }
}
