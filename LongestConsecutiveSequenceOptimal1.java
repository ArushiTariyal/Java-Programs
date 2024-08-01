import java.util.HashSet;
public class LongestConsecutiveSequenceOptimal1 {
        public int longestConsecutive(int[] nums) {
            //optimal
            if(nums.length==0) return 0;
            HashSet<Integer> s = new HashSet<>();
            for(int i = 0; i<nums.length; i++){
                s.add(nums[i]);
            }
            int longest = 1;
            for(int e: s){
                int val = e;
                int count = 1;
                if(!s.contains(val-1)){
                    while(s.contains(val+1)){
                        count++;
                        val++;
                    }
                    longest = Math.max(longest,count);
                }
            }
            return longest;
        }

}
