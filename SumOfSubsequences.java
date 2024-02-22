import java.util.ArrayList;

public class SumOfSubsequences {
    public static void solve(int[] ip, ArrayList<Integer> op, int i, int key, int sum1){
        if(i>=ip.length){
            if(sum1==key) System.out.println(op);
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>();
        ArrayList<Integer> op2 = new ArrayList<>();
        op1.addAll(op);
        op2.addAll(op);

        op2.add(ip[i]);
        solve(ip,op1,i+1,key,sum1);
        sum1 += ip[i];
        solve(ip, op2, i+1, key, sum1);
    }
    public static void main(String[] args) {
        int[] ip = {1,2,1};
        ArrayList<Integer> op = new ArrayList<>();
        solve(ip,op,0,2,0);
    }
}
