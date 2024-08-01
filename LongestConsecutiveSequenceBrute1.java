public class LongestConsecutiveSequenceBrute1 {

        public int longestConsecutive(int[] nums) {
            //brute
            if(nums.length==0) return 0;
            int longest = 1;
            for(int i = 0; i<nums.length; i++){
                int count = 1;
                int val = nums[i];
                while(ls(val,nums)){
                    val += 1;
                    count += 1;
                }
                longest = Math.max(count,longest);
            }
            return longest;
        }
        public boolean ls(int val, int[] nums){
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==val+1) return true;
            }
            return false;
        }


}
