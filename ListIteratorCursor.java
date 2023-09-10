import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorCursor {
    public static void main(String[] args){
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        List<String> al = new ArrayList<String>(Arrays.asList(days));
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            String obj = (String) li.next();
            System.out.println(li.nextIndex()+") "+obj);
        }
    }
}
