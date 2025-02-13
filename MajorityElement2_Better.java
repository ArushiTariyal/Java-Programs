import java.util.*;
public class MajorityElement2_Better {
    //BETTER
    class Solution {
        public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer,Integer> hm = new HashMap<>();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
                if(entry.getValue()>nums.length/3) l.add(entry.getKey());
            }
            return l;
        }
    }
}
