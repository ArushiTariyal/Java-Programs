import java.util.ArrayList;
import java.util.Collections;

public class PermutationWithCaseChange {
    public static void permutations(String ip, String op, ArrayList<String> a){
        if(ip.length()==0){
            a.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;

        op1 += ip.charAt(0);
        op2 += ip.toUpperCase().charAt(0);

        ip = ip.substring(1);
        permutations(ip,op1,a);
        permutations(ip,op2,a);
    }
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        String ip = "ABC";
        ip = ip.toLowerCase();
        String op = "";
        permutations(ip,op,a);
        Collections.sort(a);
        System.out.println(a);
    }
}
