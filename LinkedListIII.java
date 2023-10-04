class Node1{
    String data;
    Node1 next;
    public Node1(String data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListIII {

    Node1 head;
    public void addFirst(String data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node1 currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node1 currNode = head;
        while(currNode.next.next!=null){
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    public void printList(){
        Node1 currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        LinkedListIII ll = new LinkedListIII();
        ll.addFirst("apple");
        ll.addFirst("an");
        ll.addFirst("is");
        ll.printList();
        System.out.println();
        ll.addLast(".");
        ll.addFirst("this");
        ll.addLast("A");
        ll.addLast("new");
        ll.addLast("phrase");
        ll.printList();
        System.out.println();
        ll.removeFirst();
        ll.removeLast();
        ll.printList();

    }

}
