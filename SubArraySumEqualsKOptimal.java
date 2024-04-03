import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsKOptimal {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            Map<Integer,Integer> hash = new HashMap<>();
            hash.put(0,1);
            int count = 0;
            int sum = 0;
            for(int i = 0; i<nums.length; i++){
                sum += nums[i];
                count += hash.getOrDefault(sum-k,0);
                hash.put(sum,hash.getOrDefault(sum,0)+1);
            }
            return count;
        }
    }
}
