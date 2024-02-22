import java.util.ArrayList;
import java.util.Arrays;

public class SubsequencesOfIntegerArray {
    public static void solve(int[] ip, ArrayList<Integer> op,int i, ArrayList<ArrayList<Integer>> ans){
        if(i>=ip.length){
            ans.add(op);
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>();
        ArrayList<Integer> op2 = new ArrayList<>();
        op1.addAll(op);
        op2.addAll(op);

        op2.add(ip[i]);
        solve(ip,op1,i+1,ans);
        solve(ip,op2,i+1,ans);

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] ip = {3,1,2};
        ArrayList<Integer> op = new ArrayList<>();
        solve(ip,op,0,ans);
        System.out.println(ans);
    }
}
