import java.util.Scanner;

public class LinkedList_DeleteKth {
    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data= data;
            this.next= next;
        }
        Node(int data){
            this.data = data;
            Node next = null;
        }
    }
    private static Node arrayToLL(int[] nums){
        Node head = new Node(nums[0]);
        Node mover = head;
        for(int i = 1; i<nums.length; i++){
            Node temp = new Node(nums[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static Node deleteKth(Node head, int el){
        int count = 0;
        Node mover = head;
        while(mover != null){
            count++;
            mover = mover.next;
        }
        if(head== null || el<=0 || el>count) return head;
        else if(el==1){
            head = head.next;
        }
        else if(el == count){
            mover = head;
            while(mover.next.next != null){
                mover = mover.next;
            }
            mover.next = null;
        }
        else{
            mover = head;
            int posn = 1;
            Node temp = null;
            while(posn != el){
                temp = mover;
                mover = mover.next;
                posn++;
            }
            temp.next = temp.next.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        while(count-->0) {
            String list = sc.nextLine();
            String[] arr = list.split(" ");
            int el = sc.nextInt();
            sc.nextLine();
            int[] nums = new int[arr.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(arr[i]);
            }
            Node head = arrayToLL(nums);
            head = deleteKth(head, el);
            Node mover = head;
            while(mover!= null){
                System.out.print(mover.data + " ");
                mover = mover.next;
            }
            System.out.println();
        }

    }
}
