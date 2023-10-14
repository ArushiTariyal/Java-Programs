public class ConcatenationOfArray {
    static class Solution {
        public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[nums.length*2];
            for(int i = 0; i<n; i++){
                ans[i]= nums[i];
                ans[i+n]= nums[i];
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] arr = Solution.getConcatenation(new int[]{1, 3, 5, 6, 2});
            for (int e : arr) System.out.print(e + " ");
        }
    }
}
