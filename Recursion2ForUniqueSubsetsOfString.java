import java.util.ArrayList;
import java.util.Collections;

public class Recursion2ForUniqueSubsetsOfString {
    static ArrayList<String> a = new ArrayList<>();
    static ArrayList<String> b = new ArrayList<>();
    public static void solve(String ip, String op){
        if(ip.length()==0){
            a.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op2 += ip.charAt(0);
        ip = ip.substring(1);

        solve(ip,op1);
        solve(ip, op2);
    }
    public static void insert(){
        if(a.size()==0) {
            return;
        }
        if(a.size()==1){
            b.add(a.get(0));
            return;
        }
        String e = a.get(a.size()-1);
        a.remove(e);
        insert();
        check(e);
    }
    public static void check(String e){
        if(b.size()==0){
            b.add(e);
            return;
        }
        String z = b.remove(b.size()-1);
        check(e);
        if(!e.equals(z)){
            b.add(z);
            return;
        }


    }
    public static void main(String[] args) {
        String ip = "aab";
        String op = "";
        solve(ip,op);
        insert();
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);
    }
}
