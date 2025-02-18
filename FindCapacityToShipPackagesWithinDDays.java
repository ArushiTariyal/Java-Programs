public class FindCapacityToShipPackagesWithinDDays {
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int sum = 0, max = Integer.MIN_VALUE;
            for(int i = 0; i<weights.length; i++){
                max = Math.max(weights[i],max);
                sum += weights[i];
            }
            int low = max, high = sum;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(daysRequired(weights,mid,days)<=days) high = mid-1;
                else low = mid+1;
            }
            return low;
        }
        public static int daysRequired(int[] weights, int weight, int days){
            int load = 0;
            int cnt = 0;
            for(int i =  0; i<weights.length; i++){
                if(load+weights[i]>weight){
                    cnt++;
                    load = weights[i];
                }
                else{
                    load += weights[i];
                }

            }
            cnt++;
            return cnt;
        }
    }
}
