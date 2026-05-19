import java.util.ArrayList;
import java.util.List;

public class InsertInterval_Greedy {
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int i = 0;
            int n = intervals.length;

            List<int[]> res = new ArrayList<>();

            while(i<n && intervals[i][1]<newInterval[0]){
                res.add(intervals[i]);
                i++;
            }

            while(i<n && intervals[i][0]<=newInterval[1]){
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
                i++;
            }

            res.add(new int[]{newInterval[0], newInterval[1]});

            while(i<n){
                res.add(intervals[i]);
                i++;
            }

            int[][] ans = new int[res.size()][2];

            int j = 0;

            for(int[] e: res){
                ans[j] = e;
                j++;
            }

            return ans;
        }
    }
}
