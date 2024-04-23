public class KokoEatingBananas {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<piles.length; i++){
                if(piles[i]>max) max  = piles[i];
            }
            long low = 1, high = max;
            while(low<=high){
                long mid = low + (high-low)/2;
                long hours = 0;
                for(int i = 0; i<piles.length; i++){
                    hours += (int)Math.ceil((double)(piles[i])/(double)mid);
                }
                if(hours<=h) high = mid-1;
                else low=mid+1;
            }
            return (int)low;
        }

    }
}
