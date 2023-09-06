import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInArrayList {
    public static void main(String[] args){

        ArrayList a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        ArrayList a2= new ArrayList<>();
        a2.add("a");
        a2.add("b");
        a2.add("c");

        ArrayList a3 = new ArrayList<>();
        a3.addAll(a1);
        a3.addAll(a2);

        Iterator i = a3.iterator();

        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }
}

