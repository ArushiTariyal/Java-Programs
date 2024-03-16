import java.util.HashSet;
import java.util.Set;

public class AllUniqueSubsetsRecursion {
    public static void uniqueSubsets(String ip, int i, String op, Set<String> s){
        if(i>=ip.length()){
           s.add(op);
            return;
        }
        op += ip.charAt(i);
        uniqueSubsets(ip,i+1,op,s);
        op = op.substring(0,op.length()-1);
        uniqueSubsets(ip,i+1,op,s);
    }
    public static void main(String[] args){
        Set<String> s = new HashSet<>();
        uniqueSubsets("aab",0,"",s);
        System.out.println(s);
    }
}
