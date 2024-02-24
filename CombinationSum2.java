import java.util.ArrayList;

public class CombinationSum2 {
    public static void sum(int[] ip, ArrayList<Integer> op, int i, int sum, int target){
        if(i==ip.length){
            if(sum==target) System.out.println(op);
            return;
        }
        ArrayList<Integer> op1 = new ArrayList<>(op);
        ArrayList<Integer> op2 = new ArrayList<>(op);

        sum(ip,op1,i+1,sum,target);

        if(ip[i]+sum<=target){
            op2.add(ip[i]);
            sum(ip,op2,i,sum+ip[i],target);
        }
    }
    public static void main(String[] args) {
        sum(new int[]{2,3,6,7},new ArrayList<>(),0,0,7);
    }
}
