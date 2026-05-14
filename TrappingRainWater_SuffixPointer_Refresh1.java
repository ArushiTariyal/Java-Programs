public class TrappingRainWater_SuffixPointer_Refresh1 {
    class Solution {
        public int trap(int[] height) {
            int leftMax = height[0];

            int water = 0;

            int[] rightMax = new int[height.length];
            rightMax[height.length-1] = height[height.length-1];
            int maxr = rightMax[height.length-1];

            int right = height.length-2;

            while(right>=0){
                maxr = Math.max(height[right],maxr);
                rightMax[right] = maxr;
                right--;
            }


            for(int i = 0; i<height.length; i++){
                int rval = rightMax[i];
                if(height[i]<leftMax && height[i]<rval){
                    water += (Math.min(leftMax,rval)-height[i]);
                }

                leftMax = Math.max(height[i],leftMax);

            }

            return water;
        }
    }
}
