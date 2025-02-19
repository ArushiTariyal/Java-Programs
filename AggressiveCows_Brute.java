import java.util.Arrays;
public class AggressiveCows_Brute {
    public class Solution {
        public static int aggressiveCows(int []stalls, int k) {
            Arrays.sort(stalls);
            int n = stalls.length;
            int low = 1, high = stalls[n-1]-stalls[0];
            for(int i = 1; i<=high; i++){
                if(canWePlaceCows(stalls,k,i)) continue;
                else return i-1;
            }
            return high;
        }
        public static boolean canWePlaceCows(int[] stalls, int cows, int dist){
            int cowPos= stalls[0], cowNum = 1;
            for(int i = 1; i<stalls.length; i++){
                if(stalls[i]-cowPos>=dist){
                    cowPos = stalls[i];
                    cowNum++;
                }
                if(cowNum==cows) return true;
            }

            return false;
        }
    }
}
