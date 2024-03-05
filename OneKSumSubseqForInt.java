import java.util.ArrayList;
import java.util.List;

public class OneKSumSubseqForInt {
        public static boolean ksum(int[] ip, int i, List<Integer> op, int sum , int k){

            if(i>=ip.length){
                if(sum==k) {
                    System.out.println(op);
                    return true;
                }
                return false;
            }
            List<Integer> op1 = new ArrayList<>(op);
            List<Integer> op2 = new ArrayList<>(op);

            if(ksum(ip,i+1,op1,sum,k)) return true;
            op2.add(ip[i]);
            if (ksum(ip, i + 1, op2, sum + ip[i], k)) return true;

            return false;
        }
        public static void main(String[] args) {
            List<Integer> op = new ArrayList<>();
            ksum(new int[]{3,1,2,1,-4,7},0,op,0,3);
        }


}
