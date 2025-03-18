import java.util.Scanner;
public class LinkedList_SearchElement {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static boolean findElement(int el, Node head){
        Node mover = head;
        while(mover != null){
            if(mover.data == el) return true;
            mover = mover.next;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many operations: ");
        int opn = Integer.parseInt(sc.nextLine());
        while(opn-->0) {
            System.out.print("Enter values: ");
            String val = sc.nextLine();
            String[] strarr = val.split(" ");
            int[] arr = new int[strarr.length];
            for (int i = 0; i < strarr.length; i++) {
                arr[i] = Integer.parseInt(strarr[i]);
            }
            System.out.print("Enter element to find: ");
            int elem = Integer.parseInt(sc.nextLine());
            Node head = arrayToLL(arr);
            System.out.println(findElement(elem,head));
        }

    }
}
