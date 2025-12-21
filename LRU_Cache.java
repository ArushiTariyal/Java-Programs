import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {
    class Node{
        int val;
        int key;
        Node prev;
        Node next;

        Node(int key, int val){
            this.val = val;
            this.key = key;
            prev = null;
            next = null;
        }
        Node(){
            val = -1;
            key = -1;
            prev = null;
            next = null;
        }
    }
    class LRUCache {
        int cap;
        Map<Integer, Node> hmap = new HashMap<>();
        Node head;
        Node tail;
        public LRUCache(int capacity) {
            cap = capacity;
            head  = new Node();
            tail  = new Node();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if(!hmap.containsKey(key)) return -1;
            Node n = hmap.get(key);
            int value = n.val;
            deleteNode(n);
            insertAfterHead(n);
            return value;
        }

        public void put(int key, int value) {

            if(hmap.containsKey(key)){
                Node n = hmap.get(key);
                n.val = value;
                deleteNode(n);
                insertAfterHead(n);

            }
            else{
                if(cap==0) return;
                if(hmap.size() == cap){
                    int k = tail.prev.key;
                    deleteNode(tail.prev);
                    hmap.remove(k);
                }
                Node n = new Node(key, value);
                hmap.put(key,n);
                insertAfterHead(n);
            }



        }
        public void deleteNode(Node n){
            Node pr = n.prev;
            Node nxt = n.next;
            pr.next = nxt;
            nxt.prev = pr;
            n.next = null;
            n.prev = null;
        }
        public void insertAfterHead(Node n){
            n.next = head.next;
            n.prev = head;
            head.next.prev = n;
            head.next = n;

        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
