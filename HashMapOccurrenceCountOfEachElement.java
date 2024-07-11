import java.util.HashMap;
import java.util.Map;

public class HashMapOccurrenceCountOfEachElement {

        public static void main(String[] args) {
            HashMap<Integer, Integer > hm = new HashMap<>();
            int[] nums = {2,4,3,2,6,5,5,0,6};
            for(int i = 0; i<nums.length; i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
                System.out.println(entry.getKey()+": "+entry.getValue()+" times");
            }
        }

}
