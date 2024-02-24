import java.util.ArrayList;

public class SubsequencesWIthSumK {
    public static void kSum(int[] ip, ArrayList<Integer> op, int i, int sum,int key){
        if(i>= ip.length || sum>key){
            if(sum==key){
                System.out.println(op);
                return;
            }
            return;
        }
        op.add(ip[i]);
        kSum(ip,op,i+1, sum+ip[i],key);
        op.remove(op.size()-1);
        kSum(ip,op,i+1, sum,key);
    }
    public static void main(String[] args) {
        int[] ip = {1,2,1};
        ArrayList<Integer> op = new ArrayList<>();
        int key = 2;
        kSum(ip,op,0,0,key);
    }
}
