import java.util.ArrayList;
import java.util.List;

public class PermutationWithCaseChangeRecursive {
    public static void caseChange(String ip, int i, String op,List<String> ans){
        if(i>=ip.length()){
            ans.add(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 += ip.charAt(i);
        caseChange(ip,i+1,op1,ans);
        op2 += Character.toString(ip.charAt(i)).toUpperCase();
        caseChange(ip,i+1,op2,ans);

    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String ip = "ab";
        caseChange(ip.toLowerCase(),0,"",ans);
        System.out.println(ans);
    }
}
