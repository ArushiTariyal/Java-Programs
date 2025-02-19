import java.util.Arrays;
public class AggressiveCows_Optimal1 {
    public class Solution {
        public static int aggressiveCows(int []stalls, int k) {
            //    Write your code here.
            Arrays.sort(stalls);
            int n = stalls.length;
            int low = 1, high = stalls[n-1]-stalls[0];
            while(low<=high){
                int mid = low + (high-low)/2;
                if(canPlaceCows(stalls,mid,k)) low = mid+1;
                else high = mid-1;
            }
            return high;
        }
        public static boolean canPlaceCows(int[] stalls, int dist, int cows){
            int cowPlace = stalls[0], cowNum = 1;
            for(int i = 1; i<stalls.length; i++){
                if(stalls[i]-cowPlace>=dist){
                    cowPlace = stalls[i];
                    cowNum++;
                }
                if(cowNum==cows) return true;
            }
            return false;
        }
    }
}
