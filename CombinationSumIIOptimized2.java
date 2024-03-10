import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIIOptimized2 {
    public static void combi(int[] ip, List<Integer> op,List<List<Integer>> ans, int target, int ind){
        if(target==0){
            ans.add(new ArrayList<>(op));
            return;
        }
        for(int i=ind; i<=ip.length-1; i++){
            if(ip[i]>target) break;
            if(i>ind && ip[i] == ip[i-1]) continue;
            op.add(ip[i]);
            combi(ip,op,ans,target-ip[i],i+1);
            op.remove(op.size()-1);

        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] ip = {10,1,2,6,1,5,7};
        Arrays.sort(ip);
        combi(ip, new ArrayList<>(), ans, 8,0);
        System.out.println(ans);
    }
}
