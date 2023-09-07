import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class LinkedList1 {
    public static void main(String[] args){
        LinkedList ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String conti = "y";
        while(conti.equals("y")){
            System.out.print("Enter the object to insert: ");
            Object e = sc.next();
            ll.add(e);
            System.out.print("Want to continue? y/n: ");
            conti = sc.next();
        }
        System.out.println("Your linked list is: "+ll);
        ll.addFirst(34);
        ll.addLast("Java");
        ll.add(4,'c');
        System.out.println("After adding some more objects: "+ll);

        ll.remove(2);
        ll.remove("Java");

        System.out.println("First object is: "+ll.getFirst());
        System.out.println("New last object after removing previous last object is: "+ll.getLast());

        Iterator i = ll.iterator();
        System.out.println("Using iterator to retrieve elements one by one:");
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
