public class SumOfSubarrayMinimums_Brute {
    class Solution {
        public int sumSubarrayMins(int[] arr) {
            int sum = 0;
            int MOD = (int) Math.pow(10,9) + 7;
            for(int i = 0; i<arr.length; i++){
                int min = arr[i];
                for(int j = i; j<arr.length; j++){
                    min = Math.min(min,arr[j]);
                    sum = (sum + min)%MOD;
                }
            }
            return sum;
        }
    }
}
