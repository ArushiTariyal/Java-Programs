import java.util.LinkedList;
import java.util.Iterator;
public class IteratorCursor {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i = 1; i<=10;){
            ll.add(i++);
        }
        Iterator it = ll.iterator();
        while(it.hasNext()){
            Integer i = (Integer) it.next();
            System.out.print(i+" ");
        }
    }
}
