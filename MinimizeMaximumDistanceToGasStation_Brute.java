public class MinimizeMaximumDistanceToGasStation_Brute {
    public class Solution {
        public static double MinimiseMaxDistance(int []arr, int K){
            // Write your code here.
            int[] havePlaced = new int[arr.length-1];
            for(int gasStation = 1; gasStation<=K; gasStation++){
                double maxLength = -1;
                int maxInd = -1;
                for(int i = 0; i<arr.length-1; i++){
                    double diff = arr[i+1]-arr[i];
                    double sectionLength = diff/(havePlaced[i]+1);
                    if(sectionLength>maxLength){
                        maxLength = sectionLength;
                        maxInd = i;
                    }
                }
                havePlaced[maxInd]++;
            }
            double ans = -1;
            for(int i = 0; i<arr.length-1; i++){
                double diff = arr[i+1]-arr[i];
                double sectionLength = diff/(havePlaced[i]+1);
                ans = Math.max(ans, sectionLength);
            }
            return ans;
        }
    }
}
