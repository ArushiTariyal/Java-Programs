public class MaximumPointsYouCanObtainFromCards_2Pointer {
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int leftsum = 0, rightsum = 0, maxSum = 0;
            for(int i = 0; i<k; i++){
                leftsum += cardPoints[i];
            }
            maxSum = leftsum;
            int rightptr = cardPoints.length-1;
            for(int i = k-1; i>=0; i--){
                leftsum -= cardPoints[i];
                rightsum += cardPoints[rightptr];
                rightptr--;
                maxSum = Math.max(maxSum,leftsum + rightsum);
            }
            return maxSum;
        }
    }
}
