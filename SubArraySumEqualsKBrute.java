public class SubArraySumEqualsKBrute {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int sum = 0, count = 0;
            for(int i = 0; i<nums.length; i++){
                for(int j = i; j<nums.length; j++){
                    sum = 0;
                    for(int n = i; n<=j; n++){
                        sum += nums[n];
                    }
                    if(sum==k) count++;
                }
            }
            return count;

        }

    }
}
