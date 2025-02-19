import java.util.*;
public class MinimizeMaximumDistanceToGasStation_Optimal {
    public class Solution {
        public static double MinimiseMaxDistance(int []arr, int K){
            // Write your code here.
            PriorityQueue<Map.Entry<Double,Integer>> pq = new PriorityQueue<>(
                    (a,b)-> b.getKey().compareTo(a.getKey())
            );
            int[] havePlaced = new int[arr.length - 1];

            for(int i = 0; i<arr.length-1; i++){
                double sectionLength = (double)arr[i+1]-arr[i];
                pq.add(new AbstractMap.SimpleEntry<>(sectionLength,i));
            }

            for(int gasStation = 1; gasStation<=K; gasStation++){
                Map.Entry<Double,Integer> p = pq.poll();
                int ind = p.getValue();
                havePlaced[ind]++;

                double diff = arr[ind+1]-arr[ind];
                double sectionLength = diff/(havePlaced[ind]+1);
                pq.add(new AbstractMap.SimpleEntry<>(sectionLength,ind));
            }
            Map.Entry<Double,Integer> p = pq.poll();
            return p.getKey();
        }
    }
}
