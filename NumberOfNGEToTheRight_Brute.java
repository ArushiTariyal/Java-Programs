public class NumberOfNGEToTheRight_Brute {
    public class Solution{
        public static int[] countNGE(int[] nums){
            int n = nums.length;
            int count = 0;
            int[] nge = new int[n];
            for(int i =0; i<n; i++){
                count = 0;
                for(int j = i+1; j<n; j++){
                    if(nums[j]>nums[i]) count++;
                }
                nge[i] = count;
            }
            return nge;
        }
    }
}
