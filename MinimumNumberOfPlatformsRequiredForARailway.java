import java.util.Arrays;

public class MinimumNumberOfPlatformsRequiredForARailway {
    class Solution {
        public int findPlatform(int[] Arrival, int[] Departure) {
            //your code goes here
            Arrays.sort(Arrival);
            Arrays.sort(Departure);

            int a = 0;
            int d = 0;
            int count = 0;
            int max = 0;

            while(a<Arrival.length){
                if(Arrival[a]<=Departure[d]){
                    count++;

                    max = Math.max(count,max);
                    a++;

                }
                else{
                    count--;
                    d++;
                }
            }
            return max;
        }
    }
}
