import java.util.HashMap;
import java.util.Map;

public class TwoSumBetterSinglePass {
        public int[] twoSum(int[] nums, int target) {
            int ind = 0;
            Map<Integer,Integer> hash = new HashMap<>();
            while(ind<=nums.length-1){
                int rem = target-nums[ind];
                if(hash.containsKey(rem) && hash.get(rem)!=ind) return new int[] {hash.get(rem),ind};
                hash.put(nums[ind],ind);
                ind++;
            }
            return new int[]{-1,-1};
        }

}
