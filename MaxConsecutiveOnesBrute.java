public class MaxConsecutiveOnesBrute {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int max = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                int count = 0;
                for (int j = i; j <= nums.length - 1; j++) {
                    if (nums[j] == 0) break;
                    else count++;
                }
                if (count > max) max = count;
            }
            return max;
        }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,0,1,1,0,1,1,1,1}));
    }

}
