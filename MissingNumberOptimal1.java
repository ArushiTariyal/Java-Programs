public class MissingNumberOptimal1 {
        public static int missingNumber(int[] nums) {
            int n = nums.length;
            int actualSum = n*(n+1)/2;
            int numsSum = 0;
            for(int i = 0; i<=nums.length-1;i++) numsSum += nums[i];
            return actualSum-numsSum;
        }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1,2,0,4,5}));
    }


}
