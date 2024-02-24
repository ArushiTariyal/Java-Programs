import java.util.ArrayList;

public class OneSubseqWithSumK {
        public static boolean kSum(int[] ip, ArrayList<Integer> op, int i, int sum, int key){
            if(i>= ip.length || sum>key){
                if(sum==key){
                    System.out.println(op);
                    return true;
                }
                return false;
            }
            op.add(ip[i]);
            if(kSum(ip,op,i+1, sum+ip[i],key)){
                return true;
            }
            op.remove(op.size()-1);
            if(kSum(ip,op,i+1, sum,key)){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            int[] ip = {1,2,1};
            ArrayList<Integer> op = new ArrayList<>();
            int key = 2;
            kSum(ip,op,0,0,key);
        }


}
