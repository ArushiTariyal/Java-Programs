import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumKForAllIntegersOptimal {
    public static void longestSubArrayWithSumK(int []a, long k) {
        Map<Long,Integer> m= new HashMap<>();
        long sum = 0;
        int len = 0;
        for(int i = 0; i<=a.length-1; i++){
            sum += a[i];
            if(sum==k) len = i+1;
            if(m.containsKey(sum-k)) len = Math.max(len,i- m.get(sum-k));
            if(!m.containsKey(sum)) m.put(sum,i);
        }
        System.out.println(len);;

    }
    public static void main(String[] args){
        longestSubArrayWithSumK(new int[]{1,2,3,1,1,1,1},3);
    }
}
