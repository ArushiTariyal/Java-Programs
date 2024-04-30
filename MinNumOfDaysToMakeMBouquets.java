public class MinNumOfDaysToMakeMBouquets {
    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            int min  = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<bloomDay.length; i++){
                if(min>bloomDay[i]) min = bloomDay[i];
                if(bloomDay[i]>max) max = bloomDay[i];
            }
            if(m*k>bloomDay.length) return -1;
            int low = min, high = max;
            while(low<=high){
                int mid = low +(high-low)/2;
                int bouquets = 0;
                int blooms = 0;
                for(int i = 0; i<bloomDay.length;i++){
                    if(bloomDay[i]<=mid) blooms++;
                    else{
                        bouquets += blooms/k;
                        blooms = 0;

                    }
                }
                bouquets += blooms/k;
                if (bouquets>=m) high = mid-1;
                else low = mid+1;
            }
            if(low>max) return -1;
            return low;
        }
    }
}
