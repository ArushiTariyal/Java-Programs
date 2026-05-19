import java.util.Arrays;

public class ShortestJobFirst_Greedy {
    class Solution {
        public long solve(int[] bt) {
            long totalWT = 0;
            long timeMoved = 0;
            Arrays.sort(bt);
            for(int i = 0; i<bt.length; i++){
                totalWT += timeMoved;
                timeMoved += bt[i];
            }

            return totalWT/bt.length;
        }
    }
}
