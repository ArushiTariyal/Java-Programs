import java.util.*;
public class SumOfSubarrayRanges_Optimal {
    class Pair{
        int val;
        int ind;

        Pair(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
    class Solution {
        public long findSmallestSum(int[] nums){
            int[] nse = new int[nums.length];
            int[] pse = new int[nums.length];
            Stack<Pair> st = new Stack<>();

            for(int i = nums.length-1; i>=0; i--){
                while(!st.isEmpty() && st.peek().val > nums[i]) st.pop();
                if(!st.isEmpty()) nse[i] = st.peek().ind;
                else nse[i] = nums.length;
                st.push(new Pair(nums[i], i));
            }

            st = new Stack<>();
            for(int i = 0; i<nums.length; i++){
                while(!st.isEmpty() && st.peek().val>=nums[i]) st.pop();
                if(!st.isEmpty()) pse[i] = st.peek().ind;
                else pse[i] = -1;
                st.push(new Pair(nums[i],i));
            }

            long total = 0;

            for(int i = 0; i<nums.length; i++){
                long left = (i - pse[i]);
                long right = (nse[i] - i);
                long contrib = (left*right);
                long totalcontrib = (nums[i]*contrib);

                total = (total + totalcontrib);
            }
            return total;
        }
        public long findLargestSum(int[] nums){
            int[] nle = new int[nums.length];
            int[] ple = new int[nums.length];
            Stack<Pair> st = new Stack<>();

            for(int i = nums.length-1; i>=0; i--){
                while(!st.isEmpty() && st.peek().val < nums[i]) st.pop();
                if(!st.isEmpty()) nle[i] = st.peek().ind;
                else nle[i] = nums.length;
                st.push(new Pair(nums[i], i));
            }

            st = new Stack<>();
            for(int i = 0; i<nums.length; i++){
                while(!st.isEmpty() && st.peek().val<=nums[i]) st.pop();
                if(!st.isEmpty()) ple[i] = st.peek().ind;
                else ple[i] = -1;
                st.push(new Pair(nums[i],i));
            }

            long total = 0;

            for(int i = 0; i<nums.length; i++){
                long left = (i - ple[i]);
                long right = (nle[i] - i);
                long contrib = (left*right);
                long totalcontrib = (nums[i]*contrib);

                total = (total + totalcontrib);
            }
            return total;
        }
        public long subArrayRanges(int[] nums) {
            long largest = findLargestSum(nums);
            long smallest = findSmallestSum(nums);

            return largest - smallest;

        }
    }
}
