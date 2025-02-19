import java.util.ArrayList;
public class PainterPartitionProblem_Optimal {
    public class Solution
    {
        public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
        {
            //    Write your code here.
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0; i<boards.size(); i++){
                max = Math.max(max,boards.get(i));
                sum += boards.get(i);
            }
            int low = max, high = sum;
            while(low<=high){
                int mid = low +(high-low)/2;
                if(painters(boards,k,mid)<=k)high = mid-1;
                else low = mid+1;
            }
            return low;
        }
        public static int painters(ArrayList<Integer> boards, int painterNum, int area){
            int painter = 1, painted =0;
            for(int i = 0; i<boards.size(); i++){
                if(boards.get(i)+painted<=area){
                    painted += boards.get(i);
                }
                else{
                    painter++;
                    painted = boards.get(i);
                }
            }
            return painter;
        }
    }
}
