public class TrappingRainWater_Brute {
    class Solution {
        public int trap(int[] height) {
            int N = height.length;
            int[] pre = new int[N];
            int[] post = new int[N];

            pre[0] = height[0];
            for(int i = 1; i<N; i++){
                pre[i] = Math.max(pre[i-1],height[i]);
            }

            post[N-1] = height[N-1];
            for(int i = N-2; i>=0; i--){
                post[i] = Math.max(post[i+1],height[i]);
            }

            int total = 0;
            for(int i = 0; i<N; i++){
                int leftMax = pre[i];
                int rightMax = post[i];
                if(height[i]<leftMax && height[i]<rightMax){
                    total += Math.min(leftMax, rightMax) - height[i];
                }
            }
            return total;
        }
    }
}
