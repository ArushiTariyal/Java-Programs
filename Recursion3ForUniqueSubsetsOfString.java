import java.util.ArrayList;
import java.util.Collections;

public class Recursion3ForUniqueSubsetsOfString {
    static ArrayList<String> b = new ArrayList<>();
    public static void solve(String ip, String op){
        if(ip.length()==0){
            insert(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op2 += ip.charAt(0);
        ip = ip.substring(1);

        solve(ip,op1);
        solve(ip, op2);
    }
    public static void insert(String e){
        if(b.size()==0){
            b.add(e);
            return;
        }
        String z = b.remove(b.size()-1);
        insert(e);
        if(!e.equals(z)) b.add(z);
    }
    public static void main(String[] args) {
        String ip = "aab";
        String op = "";
        solve(ip,op);
        Collections.sort(b);
        System.out.println(b);
    }
}

