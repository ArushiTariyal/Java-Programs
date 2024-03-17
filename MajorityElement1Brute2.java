import java.util.Arrays;

public class MajorityElement1Brute2 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }

}
