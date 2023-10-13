public class FindPivotIndex {
    static class Solution {
        public static int pivotIndex(int[] nums) {
            int sum = 0,lSum = 0;
            for(int e: nums) sum += e;
            for(int i = 0; i<nums.length;lSum += nums[i++]){
                if(lSum*2 == sum - nums[i]) return i;
            }
            return -1;
        }
        public static void main(String[] args){
            System.out.println(Solution.pivotIndex(new int[] {1,2,4,5,7}));
            System.out.println(Solution.pivotIndex(new int[] {1,2,4,5,7,1}));
        }
    }
}
