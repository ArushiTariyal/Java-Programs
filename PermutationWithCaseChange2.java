import java.util.ArrayList;
import java.util.List;

public class PermutationWithCaseChange2 {
    public static void caseChange(String ip, int i, String op,List<String> ans){
        if(i>=ip.length()){
            ans.add(op);
            return;
        }

        caseChange(ip,i+1,op+ip.charAt(i),ans);
        caseChange(ip,i+1,op + Character.toString(ip.charAt(i)).toUpperCase(),ans);

    }
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        String ip = "ab";
        caseChange(ip.toLowerCase(),0,"",ans);
        System.out.println(ans);
    }
}

