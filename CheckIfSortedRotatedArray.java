public class CheckIfSortedRotatedArray {
    static class Solution {
        public static boolean check(int[] nums) {
            int n = nums.length;
            int count = 0;
            int i = 0;
            while(i<n){
                if(nums[i]>nums[(i++ +1)%n]) count++;
            }
            return count <= 1;
        }
    }
    public static void main(String[] args){
        System.out.println(Solution.check(new int[]{4,5,1,2,3}));
        System.out.println(Solution.check(new int[]{1,1,1,1}));
    }
}
