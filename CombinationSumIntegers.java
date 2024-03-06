import java.util.ArrayList;
import java.util.List;

public class CombinationSumIntegers {
    public static void f(int[] ip, int i, List<Integer> op, int t, int s, List<List<Integer>> ans){
        if(i>=ip.length){
            if(s==t) ans.add(op);
            return;
        }
        List<Integer> op1 = new ArrayList<>(op);
        f(ip,i+1,op1,t,s,ans);

        List<Integer> op2 = new ArrayList<>(op);
        op2.add(ip[i]);
        f(ip,i+1,op2,t,s+ip[i],ans);

    }
    public static void main(String[] args) {
        int[] ip = {1,2,3,6,7};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        f(ip,0,op,7,0,ans);
        System.out.println(ans);
    }
}
