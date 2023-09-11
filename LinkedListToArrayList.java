import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListToArrayList {
    public static void main(String[] args){
        LinkedList ll = new LinkedList<>();
        for(int i = 0; i<=10; i++){
            ll.add((char) (i+97));
        }
        System.out.println("Linked List is: "+ ll);

        ArrayList al = new ArrayList<>(ll);
        System.out.println("Array List created is: "+ al);

        System.out.println("On traversing each object of Array List: ");
        Iterator it = al.iterator();
        int count = 1;
        while(it.hasNext()){
            Character c = (Character) it.next();
            System.out.print(count++ + ") " );
            System.out.println(c);
        }
    }
}
