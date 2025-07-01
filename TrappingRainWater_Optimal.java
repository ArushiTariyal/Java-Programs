public class TrappingRainWater_Optimal {
    class Solution {
        public int trap(int[] height) {
            int l = 0, r = height.length-1;
            int total = 0;
            int maxLeft = 0;
            int maxRight = 0;
            while(l<r){
                if(height[l]<height[r]){
                    if(maxLeft>height[l]){
                        total += maxLeft - height[l];
                    }
                    else maxLeft = height[l];
                    l++;
                }
                else{
                    if(maxRight>height[r]){
                        total += maxRight - height[r];
                    }
                    else maxRight = height[r];
                    r--;
                }
            }
            return total;
        }
    }
}
