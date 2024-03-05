import java.util.ArrayList;
import java.util.List;

public class KSumSubseqForIntegers {
    public static void subseqK(int[] ip, int i, List<Integer> op, int sum, int k){
        if(i>=ip.length){
            if(sum==k) System.out.println(op);
            return;
        }
        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);
//        op1.addAll();
//        op2.addAll();

        op2.add(ip[i]);
        subseqK(ip,i+1,op1, sum,k);
        subseqK(ip,i+1,op2,sum+ip[i],k);
    }
    public static void main(String[] args) {
        List<Integer> op = new ArrayList<>();
        subseqK(new int[]{1,3,-1,0,-2},0,op,0,0);
    }
}
