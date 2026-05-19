import java.util.*;
public class LRUCache_LinkedList_Map_Greedy {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    class LRUCache {

        Node head;
        Node tail;


        Map<Integer, Node> map;
        int capacity;

        public void deleteNode(Node node){
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }

        public void insertAfterHead(Node node){
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
            head = new Node(-1,-1);
            tail = new Node(-1,-1);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                Node node = map.get(key);
                deleteNode(node);
                insertAfterHead(node);
                return node.val;
            }
            else return -1;

        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                Node node = map.get(key);
                deleteNode(node);
                node.val = value;
                insertAfterHead(node);

            }
            else{
                if(map.size()>=capacity){
                    Node n = tail.prev;
                    deleteNode(n);
                    map.remove(n.key);

                }
                Node node = new Node(key, value);
                insertAfterHead(node);
                map.put(key,node);
            }
        }

    }
}
