public class KokoEatingBananas2 {
    public class Solution {
        public static int minimumRateToEatBananas(int []v, int h) {
            // Write Your Code Here
            int max = Integer.MIN_VALUE;
            for(int i  = 0; i<v.length; i++){
                if(v[i]>max) max = v[i];
            }
            int low = 1, high = max;
            int ans = -1;
            while(low<=high){
                int mid = low + (high-low)/2;
                int totalhours = calcHours(v,mid);

                if(totalhours<=h){
                    ans = mid;
                    high = mid-1;
                }
                else low = mid+1;
            }
            return ans;
        }
        public static int calcHours(int[] v, int mid){
            int hours = 0;
            for(int i = 0; i<v.length; i++){
                hours += Math.ceil((double)v[i]/mid);
            }
            return hours;
        }
    }




}
