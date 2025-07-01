public class NextGreaterElementII_Brute {
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int[] neg = new int[nums.length];
            for(int i = 0; i<neg.length; i++){
                neg[i] = -1;
            }
            int N = nums.length;
            for(int i = 0; i<neg.length; i++){
                for(int j = i+1; j<=i+N-1;j++) {
                    int ind = j%N;
                    if(nums[i]<nums[ind]){
                        neg[i] = nums[ind];
                        break;
                    }
                }
            }
            return neg;
        }
    }
}
