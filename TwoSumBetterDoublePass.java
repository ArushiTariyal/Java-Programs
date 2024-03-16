import java.util.HashMap;
import java.util.Map;
public class TwoSumBetterDoublePass {
        public int[] twoSum(int[] nums, int target) {
            int ind = 0;
            Map<Integer,Integer> hash = new HashMap<>();
            for(int i = 0; i<=nums.length-1; i++){
                hash.put(nums[i],i);
            }
            while(ind<=nums.length-1){
                int rem = target-nums[ind];
                if(hash.containsKey(rem) && hash.get(rem)!=ind) return new int[] {hash.get(rem),ind};
                ind++;
            }
            return new int[]{-1,-1};
        }

}
