import java.util.Vector;
import java.util.Enumeration;
public class EnumerationCursor {
    public static void main(String[] args){
        Vector<Character> v = new Vector<Character>(20);
        for(int i=0; i<=10; i++){
            v.add((char) (i+65));
        }
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Character obj = (Character) e.nextElement();
            System.out.print(obj+" ");
        }
    }
}
