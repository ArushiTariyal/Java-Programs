import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RecursionForUniqueSubsetsOfString {
    static Set<String> s = new HashSet<>();
    public static void uniqueSubsets(String ip, String op){
        if(ip.length()==0){
            s.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op2 = op2 + ip.charAt(0);

        ip = ip.substring(1);

        uniqueSubsets(ip,op1);
        uniqueSubsets(ip,op2);
    }
    public static void main(String[] args) {
        String ip = "aab";
        String op = "";
        uniqueSubsets(ip,op);
        Iterator<String> i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
