import java.util.HashMap;
import java.util.Map;

public class MajorityElement1Better {
        public int majorityElement(int[] nums) {
            Map<Integer,Integer> hash = new HashMap<>();
            for(int i = 0; i<=nums.length-1; i++){
                hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
                if(entry.getValue()>nums.length/2) {
                    return entry.getKey();

                }
            }
            return -1;
        }

}
