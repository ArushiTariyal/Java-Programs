import java.util.Arrays;

public class JobSequencingProblem_Greedy {
    class Solution {

        public int[] JobScheduling(int[][] Jobs) {
            Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);

            int maxDeadline = 0;

            for(int i = 0; i<Jobs.length; i++){
                maxDeadline = Math.max(maxDeadline, Jobs[i][1]);
            }

            int[] dayTracker = new int[maxDeadline+1];
            int maxProfit = 0;
            int count = 0;

            for(int i = 0; i<Jobs.length; i++){
                int deadline = Jobs[i][1];

                for(int j = deadline; j>0; j--){
                    if(dayTracker[j]==0){
                        dayTracker[j] = Jobs[i][0];
                        maxProfit += Jobs[i][2];
                        count++;
                        break;
                    }
                }

            }

            return new int[] {count, maxProfit};
        }
    }
}
