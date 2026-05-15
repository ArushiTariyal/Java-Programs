public class TrappingRainWater_TwoPointer_Reprise1 {
    class Solution {
        public int trap(int[] height) {
            int l = 0;
            int maxl = height[l];

            int r = height.length-1;
            int maxr = height[r];

            int water = 0;

            while(l<=r){
                if(height[l]<=height[r]){
                    water += (maxl - height[l] < 0)? 0: maxl - height[l];
                    maxl = Math.max(maxl,height[l]);
                    l++;
                }
                else{
                    int diff = maxr - height[r];

                    water += (diff<0) ? 0 : diff;
                    maxr = Math.max(maxr, height[r]);
                    r--;
                }
            }

            return water;
        }
    }
}
