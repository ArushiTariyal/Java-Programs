public class RotateArray {
    static class Solution {
        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[(i+k)%n] = nums[i];
            }
            System.arraycopy(arr, 0, nums, 0, n);
            for(int e: nums) System.out.print(e+" ");
            System.out.println();
        }
        public static void main(String[] args){
            Solution.rotate(new int[]{1,2,3,4,5,6,7},3);
            Solution.rotate(new int[]{-1,-100,3,99},2);
        }
    }
}
