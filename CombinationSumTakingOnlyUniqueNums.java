import java.util.ArrayList;
import java.util.List;

public class CombinationSumTakingOnlyUniqueNums {
    public static void combiSum(List<Integer> arr, int[] ip, List<Integer> op, int i, int target){
        if(i>=ip.length) {
            if(target==0) System.out.println(op);
            return;
        }
        if ( !op.contains(ip[i]) && target >= ip[i] ){
                op.add(ip[i]);
                combiSum(arr, ip, op, i + 1, target - ip[i]);
                op.remove(op.size() - 1);

            }
            combiSum(arr, ip, op, i + 1, target);


    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        combiSum(arr,new int[]{10,1,2,7,6,1,5},op,0,7);
    }
}
