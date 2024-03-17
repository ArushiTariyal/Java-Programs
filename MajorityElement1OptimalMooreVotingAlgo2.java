public class MajorityElement1OptimalMooreVotingAlgo2 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el=nums[0];
        for(int i = 0; i<=nums.length-1; i++){
            if(count==0) el=nums[i];
            if(nums[i]==el) count++;
            else count--;
        }
        return el;
    }

}
