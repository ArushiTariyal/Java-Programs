import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SortKSortedArray_Heaps_PQ {

    class Solution {
        // Function to sort a k-sorted array using a priority queue
        public List<Integer> sortNearlySortedArray(List<Integer> arr, int k) {
            // Create a min heap using PriorityQueue
            List<Integer> list = new ArrayList<>();
            PriorityQueue<Integer> minheap = new PriorityQueue<>();
            for (int i = 0; i <= k && i < arr.size(); i++) {
                minheap.add(arr.get(i));
            }

            for(int i = k+1; i<arr.size(); i++){
                list.add(minheap.poll());
                minheap.add(arr.get(i));
            }

            while(!minheap.isEmpty()) list.add(minheap.poll());
            return list;
        }
    }
}


